package br.com.commons.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadUtil {

    // Determine the time to wait for thread is finished
    private final int TIMEOUT_SHUTDOWN_THREAD = 15;
    // Determine the number of cores on the device
    private final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    // Keep a only one intânce from ExecutorService
    private ExecutorService shortExecutorService;
    // Keep a only one intânce from ExecutorService
    private ExecutorService longExecutorService;
    // Keep a only one intânce from scheduledExecutorService
    private ScheduledExecutorService scheduledExecutorService;
    // Number of threads that the pooll will be configured
    private int qtdeShortPoollThreads;
    // Number of threads that the pooll will be configured
    private int qtdeLongPoolThreads;
    // Number of threads that the pooll will be configured
    private int qtdeSchedulePoolThreads;

    private ThreadUtil() {
    }

    public static ThreadUtil newInstance() {
        return new ThreadUtil();
    }

    /**
     * Configura o pool de scheduleExecutor se ele estiver nulo.
     */
    private void configureScheduleExecutor() {
        if (scheduledExecutorService == null) {
            final int qtde = qtdeSchedulePoolThreads == 0 ? NUMBER_OF_CORES * 2 : qtdeSchedulePoolThreads;
            scheduledExecutorService = Executors.newScheduledThreadPool(qtde);
        }
    }

    /**
     * Termina todos os poolls
     *
     * @param isRunInParallel
     */
    public void finishAllPoolls(final boolean isRunInParallel) {
        if (isRunInParallel) {
            getCachedThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    finishAllPoollsServices();
                }
            });
        } else {
            finishAllPoollsServices();
        }
    }

    /**
     * Termina todos os poolls
     */
    private void finishAllPoollsServices() {
        finishShortPoollService();
        finishLongPoollService();
        finishSchedulePoollService();
    }

    /**
     * Encerra o pooll
     *
     * @return
     */
    public boolean finishShortPoollService() {
        if (shortExecutorService != null) {
            if (finish(shortExecutorService)) {
                shortExecutorService = null;
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Encerra o pooll
     *
     * @return
     */
    public boolean finishLongPoollService() {
        if (longExecutorService != null) {
            if (finish(longExecutorService)) {
                longExecutorService = null;
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Encerra o pooll
     *
     * @return
     */
    public boolean finishSchedulePoollService() {
        if (scheduledExecutorService != null) {
            if (finish(scheduledExecutorService)) {
                scheduledExecutorService = null;
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Se o pooll ja estiver configurado, então, ele terminará o pooll esperando
     * por 30 segundos e, caso ele for parado com sucesso, ele reconfigura o
     * pool.
     *
     * @param qtdeShortPoollThreads
     * @return true se foi configurado com sucesso e false, caso contrário
     */
    public boolean setQtdeShortPoollThreads(final int qtdeShortPoollThreads) {
        this.qtdeShortPoollThreads = qtdeShortPoollThreads;
        if (shortExecutorService != null) {
            if (finish(shortExecutorService)) {
                shortExecutorService = null;
                getLongServicesExecutor();
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Se o pooll ja estiver configurado, então, ele terminará o pooll esperando
     * por 30 segundos e, caso ele for parado com sucesso, ele reconfigura o
     * pool.
     *
     * @param qtdeLongPoolThreads
     * @return true se foi configurado com sucesso e false, caso contrário
     */
    public boolean setQtdeLongPoolThreads(final int qtdeLongPoolThreads) {
        this.qtdeLongPoolThreads = qtdeLongPoolThreads;
        if (longExecutorService != null) {
            if (finish(longExecutorService)) {
                longExecutorService = null;
                getLongServicesExecutor();
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Se o pooll ja estiver configurado, então, ele terminará o pooll esperando
     * por 30 segundos e, caso ele for parado com sucesso, ele reconfigura o
     * pool. Será preciso reagendar todos os schedule previamente agendados.
     *
     * @param qtdeSchedulePoolThreads
     * @return true se foi configurado com sucesso e false, caso contrário
     */
    public boolean setQtdeSchedulePoolThreads(final int qtdeSchedulePoolThreads) {
        this.qtdeSchedulePoolThreads = qtdeSchedulePoolThreads;
        if (scheduledExecutorService != null) {
            if (finish(scheduledExecutorService)) {
                scheduledExecutorService = null;
                configureScheduleExecutor();
                return true;
            }
            return false;
        }
        return true;
    }

    /**
     * Verifica se o pooll está configurado
     *
     * @return
     */
    public boolean isShortServicesPoollIsconfigured() {
        return shortExecutorService == null;
    }

    /**
     * Verifica se o pooll está configurado
     *
     * @return
     */
    public boolean isLongServicesPoollIsconfigured() {
        return longExecutorService == null;
    }

    /**
     * Verifica se o pooll está configurado
     *
     * @return
     */
    public boolean isScheduleServicesPoollIsconfigured() {
        return scheduledExecutorService == null;
    }

    /**
     * Obs: Não finalizar o pool diretamente(Irá parar todas as threads do
     * poll). Use os métodos desta classe apropriadamente. Este poll só será
     * configurado uma vez e se este método for chamado pelo menos uma vez.
     *
     * @return the executor to run threads
     */
    public ExecutorService getShortServicesExecutor() {
        if (shortExecutorService == null) {
            final int qtde = qtdeShortPoollThreads == 0 ? NUMBER_OF_CORES * 2 : qtdeShortPoollThreads;
            shortExecutorService = Executors.newFixedThreadPool(qtde);
        }
        return shortExecutorService;
    }

    /**
     * Obs: Não finalizar o pool diretamente(Irá parar todas as threads do
     * poll). Use os métodos desta classe apropriadamente. Este poll só será
     * configurado uma vez e se este método for chamado pelo menos uma vez.
     *
     * @return the executor to run threads
     */
    public ExecutorService getLongServicesExecutor() {
        if (longExecutorService == null) {
            final int qtde = qtdeLongPoolThreads == 0 ? NUMBER_OF_CORES * 2 : qtdeLongPoolThreads;
            longExecutorService = Executors.newFixedThreadPool(qtde);
        }
        return longExecutorService;
    }

    /**
     * Obs: Não finalizar o pool diretamente(Irá parar todas as threads do
     * poll). Use os métodos desta classe apropriadamente. Este poll só será
     * configurado uma vez e se este método for chamado pelo menos uma vez.
     *
     * @param runnable
     * @param inicialDelay
     * @param period
     * @param timeUnit
     * @return
     */
    public ScheduledFuture getScheduleExecutor(final Runnable runnable, final int inicialDelay, final long period, final TimeUnit timeUnit) {
        configureScheduleExecutor();
        return scheduledExecutorService.scheduleAtFixedRate(runnable, inicialDelay, period, timeUnit);
    }

    /**
     * Obs: Não finalizar o pool diretamente(Irá parar todas as threads do
     * poll). Use os métodos desta classe apropriadamente. Este poll só será
     * configurado uma vez e se este método for chamado pelo menos uma vez.
     *
     * @return the executor to run threads
     */
    public ExecutorService getCachedThreadExecutor() {
        return Executors.newCachedThreadPool();
    }

    /**
     * Termina o pool em execução.
     *
     * @param pool
     * @param isRunInParallel
     */
    public void finish(final ExecutorService pool, final boolean isRunInParallel) {
        if (isRunInParallel) {
            getCachedThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    finish(pool);
                }
            });
        } else {
            finish(pool);
        }
    }

    /**
     * Termina o pool em execução.
     *
     * @param pool
     * @param isRunInParallel
     * @param timeToWaitShutdown
     * @param timeUnit
     */
    public void finish(final ExecutorService pool, final boolean isRunInParallel,
            final int timeToWaitShutdown, final TimeUnit timeUnit) {

        if (isRunInParallel) {
            getCachedThreadExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    finish(pool, timeToWaitShutdown, timeUnit);
                }
            });
        } else {
            finish(pool, timeToWaitShutdown, timeUnit);
        }
    }

    /**
     * Termina o pool em execução.
     *
     * @param future
     * @param mayInterruptIfRunning
     */
    public void finish(final Future future, final boolean mayInterruptIfRunning) {
        if (future != null) {
            future.cancel(mayInterruptIfRunning);
        }
    }

    /**
     * Termina o pool em execução.
     *
     * @param pool
     */
    private boolean finish(final ExecutorService pool) {
        return finish(pool, TIMEOUT_SHUTDOWN_THREAD, TimeUnit.SECONDS);
    }

    /**
     * Termina o pool em execução.
     *
     * @param pool
     * @param timeToWaitShutdown
     * @param timeUnit
     * @return
     */
    private boolean finish(final ExecutorService pool, final int timeToWaitShutdown, final TimeUnit timeUnit) {
        if (pool != null) {
            pool.shutdown(); // Disable new tasks from being submitted
            try {
                // Wait a while for existing tasks to terminate
                if (!pool.awaitTermination(timeToWaitShutdown, timeUnit)) {
                    // if don´t stopeed within time, then call the method below
                    pool.shutdownNow(); // Cancel currently executing tasks
                    return pool.awaitTermination(timeToWaitShutdown, timeUnit);
                }
                return true;
            } catch (final InterruptedException ie) {
                // (Re-)Cancel if current thread also interrupted
                pool.shutdownNow();
                // Preserve interrupt status
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return false;
    }

    /**
     * Espera o tempo solicitado
     *
     * @param timeInMillis
     */
    public void sleep(long timeInMillis) {
        try {
            Thread.sleep(timeInMillis);
        } catch (final InterruptedException ex) {
        }
    }

}
