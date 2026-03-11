package org.prep.phase1;

import java.util.Scanner;

// Reverse a string without using built-in functions.
public class P11 {


    public static String reverseWithoutBuiltinFunction(String word){
        StringBuilder builder = new StringBuilder();

        if(word == null || word.isEmpty()){
            return "Word is Empty, Can't reverse";
        }

        if(word.length() < 1){
            return word;
        }

        for(int i = word.length() - 1; i >= 0; i--){
            char[] charWord = word.toCharArray();
            builder.append(charWord[i]);
        }



        return builder.toString();
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to be reverse : ");
        System.out.println("Reversed String : " + reverseWithoutBuiltinFunction(scanner.nextLine()));
    }
}
