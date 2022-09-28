package com.company.java_core.homework10.task1;

public class PalindromException extends Exception{
    private String word;

    public PalindromException(String palindrom) {}

    private boolean PalindromException(String word){
        if(word.length()>5){
            System.out.println("Невірний формат слова!");
        }
        return false;
    }
}
