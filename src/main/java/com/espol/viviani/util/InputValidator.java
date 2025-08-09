package com.espol.viviani.util;

public class InputValidator {
    // valida que el campo no sea vacío
    public static boolean validateFullField(String text) {
        return (!text.equals("") && text != null) ? true : false;
    }

    public static boolean isPositiveInteger(String str) {
        return str != null && str.matches("\\d+");
    }

    public static boolean isPositiveDecimal(String str) {
        return str != null && str.matches("\\d+\\.\\d+");
    }



}
