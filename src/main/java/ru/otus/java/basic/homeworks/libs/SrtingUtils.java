package ru.otus.java.basic.homeworks.libs;

public class SrtingUtils {
    public static String valueStartsFromPattern(String str,String pattern){
        return str.trim().substring(str.trim().lastIndexOf(pattern));
    }

}
