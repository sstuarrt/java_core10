package com.company.java_core.homework10.task1;

import java.util.Scanner;

public class Main extends PalindromException{
    public Main(String palindrom) {
        super(palindrom);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть слово з 5 букв: ");
        String palindrom = new String(sc.next());
        palindrom.toLowerCase();
        palindrom.trim();

        if(palindrom.length() > 5) {
            try {
                throw new PalindromException(palindrom);
            } catch (PalindromException e) {
                e.printStackTrace();
            }
        } else {
            if(palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1)){
                if(palindrom.charAt(1) == palindrom.charAt(palindrom.length()-2)){
                    System.out.println("Введене слово є паліндромом!");
                }
            } else {
                System.out.println("Введене слово не є паліндромом!");
            }
        }
    }
}
