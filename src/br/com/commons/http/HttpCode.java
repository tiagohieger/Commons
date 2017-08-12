/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.http;

/**
 *
 * @author Richeli Vargas
 */
public interface HttpCode {

    // Informativa
    public static final int CODE_100 = 100;// Continuar
    public static final int CODE_101 = 101;// Mudando protocolos
    public static final int CODE_102 = 102;// Processamento (WebDAV) (RFC 2518)
    public static final int CODE_122 = 122;// Pedido-URI muito longo
    // Sucesso                      
    public static final int CODE_200 = 200;// OK
    public static final int CODE_201 = 201;// Criado
    public static final int CODE_202 = 202;// Aceito
    public static final int CODE_203 = 203;// não-autorizado (desde HTTP/1.1)
    public static final int CODE_204 = 204;// Nenhum conteúdo
    public static final int CODE_205 = 205;// Reset
    public static final int CODE_206 = 206;// Conteúdo parcial
    public static final int CODE_207 = 207;// Status Multi (WebDAV) (RFC 4918)
    // Redirecionamento            
    public static final int CODE_300 = 300;// Múltipla escolha
    public static final int CODE_301 = 301;// Movido
    public static final int CODE_302 = 302;// Encontrado
    public static final int CODE_304 = 304;// Não modificado
    public static final int CODE_305 = 305;// Use Proxy (desde HTTP/1.1)
    public static final int CODE_306 = 306;// Proxy Switch
    public static final int CODE_307 = 307;// Redirecionamento temporário (desde HTTP/1.1)
    // Erro de cliente              
    public static final int CODE_400 = 400;// Requisição inválida
    public static final int CODE_401 = 401;// Não autorizado
    public static final int CODE_402 = 402;// Pagamento necessário
    public static final int CODE_403 = 403;// Proibido
    public static final int CODE_404 = 404;// Não encontrado
    public static final int CODE_405 = 405;// Método não permitido
    public static final int CODE_406 = 406;// Não Aceitável
    public static final int CODE_407 = 407;// Autenticação de proxy necessária
    public static final int CODE_408 = 408;// Tempo de requisição esgotou (Timeout)
    public static final int CODE_409 = 409;// Conflito
    public static final int CODE_440 = 440;// Gone
    public static final int CODE_411 = 411;// comprimento necessário
    public static final int CODE_412 = 412;// Pré-condição falhou
    public static final int CODE_413 = 413;// Entidade de solicitação muito grande
    public static final int CODE_414 = 414;// Pedido-URI Too Long
    public static final int CODE_415 = 415;// Tipo de mídia não suportado
    public static final int CODE_416 = 416;// Solicitada de Faixa Não Satisfatória
    public static final int CODE_417 = 417;// Falha na expectativa
    public static final int CODE_418 = 418;// Eu sou um bule de chá
    public static final int CODE_422 = 422;// Entidade improcessável (WebDAV) (RFC 4918)
    public static final int CODE_423 = 423;// Fechado (WebDAV) (RFC 4918)
    public static final int CODE_424 = 424;// Falha de Dependência (WebDAV) (RFC 4918)
    public static final int CODE_425 = 425;// coleção não ordenada (RFC 3648)
    public static final int CODE_426 = 426;// Upgrade Obrigatório (RFC 2817)
    public static final int CODE_450 = 450;// bloqueados pelo Controle de Pais do Windows
    public static final int CODE_499 = 499;// cliente fechou Pedido (utilizado em ERPs/VPSA)
    // outros erros                 
    public static final int CODE_500 = 500;// Erro interno do servidor (Internal Server Error)
    public static final int CODE_501 = 501;// Não implementado (Not implemented)
    public static final int CODE_502 = 502;// Bad Gateway
    public static final int CODE_503 = 503;// Serviço indisponível (Service Unavailable)
    public static final int CODE_504 = 504;// Gateway Time-Out
    public static final int CODE_505 = 505;// HTTP Version not supported

}
