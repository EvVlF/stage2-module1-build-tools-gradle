package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty() || str.matches("^0+(\\.0+)?$")) {
            return false;
        }
        return str.matches("\\+?\\d+(?:\\.\\d+)?(?:/(?:\\d+(?:\\.\\d+)?)?)?");
    }
}
