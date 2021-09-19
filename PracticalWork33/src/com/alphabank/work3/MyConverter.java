package com.alphabank.work3;

@FunctionalInterface
public interface MyConverter {
    String convertStr(String str);
    static boolean isNull(String str) {
        return str == null ? true : str.trim() == "" ? true : false;
    }
}
