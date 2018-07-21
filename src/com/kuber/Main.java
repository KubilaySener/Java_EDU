package com.kuber;

public class Main {
    //Console color define.
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    // Console color define end.
    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE +"Bu proje Berna ve Kubilay tarafından geliştirilmektedir."+ ANSI_RESET);

        //Lecture_1
        System.out.println(ANSI_GREEN + "Lecture_1" + ANSI_RESET);
        int myIntVal = 5 / 3 ;
        double myDoubleVal = 5d / 3;
        float myFloatVal=5f/ 3 ;

        System.out.println("Integer Value = " + myIntVal);
        System.out.println("Double Value = " + myDoubleVal);
        System.out.println("Float Value = " + myFloatVal);

        // End of Lecture_1
        // Seperator.
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // End of Seperator.
        // Pound to Kilogram Converter
        System.out.println(ANSI_GREEN +"Pound to Kilogram Converter" + ANSI_RESET);
        double poundvalue = 200d;
        double kgrate= 0.45359237d;

        double result= poundvalue * kgrate;

        System.out.println(poundvalue + " Pound is " + result + " kg.");
        // End of Pound to Kilogram Converter


    }
}


