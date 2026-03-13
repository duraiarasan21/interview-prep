package org.prep.phase1;

import java.util.HashSet;
import java.util.Set;

/**
 * P17 : Remove all duplicate characters from a string.
 */
public class P17 {

    public static String removeDuplicates(String word){
        if(word.isEmpty()){
            return "String is Empty";
        }
        if(word.length() == 1){
            return word;
        }
        Set<Character> characterSet = new HashSet<>();
        for(char ch : word.toCharArray()){
            characterSet.add(ch);
        }
        StringBuilder builder = new StringBuilder();
        for(char ch : characterSet){
            builder.append(ch);
        }
        return builder.toString();
    }

    public static void main(String[] args){
        String word = "ExceptionInInitializerError";
        System.out.println("Word : " + word + "\nDuplicate Removed Word : " + removeDuplicates(word.toLowerCase()));
    }
}
