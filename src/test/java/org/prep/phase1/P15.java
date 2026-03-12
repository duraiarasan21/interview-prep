package org.prep.phase1;

import java.util.HashMap;
import java.util.Map;

/**
 * P15 : Count the occurrences of each character in a string using Map
 */
public class P15 {

    public static void charOccurrences(String word){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(char ch : word.toCharArray()){
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1 );
        }
        for(Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()){
            System.out.println("Char : " + entry.getKey() + " - Occurrence : " + entry.getValue());
        }
    }
    public static void main(String[] args){
        charOccurrences("aAaaaabbbbbbcccclllllllddd");
    }
}
