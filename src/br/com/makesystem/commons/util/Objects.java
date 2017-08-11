package br.com.makesystem.commons.util;

public class Objects {

    public static boolean equals(final Object obj1, final Object obj2) {

        if (obj1 == null && obj2 != null) {
            return false;
        } else if (obj1 != null && obj2 == null) {
            return false;
        } else if (obj1 == null && obj2 == null) {
            return true;
        } else {
            return java.util.Objects.equals(obj1, obj2);
        }
    }

}
