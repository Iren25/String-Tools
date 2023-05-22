package org.example;

public abstract class StringTools {
    public static String FirstToUpperCase(String str){
        return Character.toUpperCase(str.charAt(0)) + str.substring(1) ;
    }
    public static boolean isStartingFromCapital(String str){
        return Character.isUpperCase(str.charAt(0));
    }
}
