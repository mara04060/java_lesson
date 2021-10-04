package com.alphabank.view;

public class ViewConstants {
    //   Перекрас консоли
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

//    Основные сообщения программы
    public static final String ENTER_COMMAND = "Enter item menu -> ";
    public static final String ERROR = ANSI_RED+"Error enter command!" + ANSI_RESET;
    public static final String SEPARATOR = ANSI_YELLOW + "------------------------------\n"+ANSI_RESET;
    public static final String FORMAT_INPUT = ANSI_BLUE + "Enter book in format:"+ANSI_RESET +" author;title;publisher;year;pages;price"+ANSI_RESET;
    public static final String ERROR_YEAR = ANSI_RED+"Year out boands!"+ANSI_RESET;
    public static final String ERROR_PAGE = ANSI_RED+"Page out boands!"+ANSI_RESET;
    public static final String ERROR_PRICE = ANSI_RED+"Price out boands!"+ANSI_RESET;
    public static final String FORMAT_PROCENT = ANSI_BLUE+"Enter edit +-% price_"+ANSI_RESET;
    public static final String ERROR_PROCENT = ANSI_RED+"Procent ONLY in (0 to 99)!"+ANSI_RESET;
    public static final String FORMAT_SEARCH_AUTHOR = ANSI_BLUE+"Search to Author"+ANSI_RESET;
    public static final String FORMAT_SEARCH_PUBLISHER = ANSI_BLUE+"Search to Publisher"+ANSI_RESET;
    public static final String FORMAT_SEARCH_YEAR = ANSI_BLUE+"Search in > Year"+ANSI_RESET;
    public static final String FORMAT_SEARCH_NOT_FOUND = ANSI_RED+"Data not Found! Please reserch query!"+ANSI_RESET;



}
