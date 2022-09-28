package com.company.java_core.homework10.task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String golosni = "a, o, y, i, e, u";
        char letter = 'a';

        if(word.chars().equals(letter)){
            word.replace('a', '-');
            word.replace('e', '-');
            word.replace('i', '-');
            word.replace('u', '-');
            word.replace('o', '-');
            word.replace('y', '-');
        }
    }
}
