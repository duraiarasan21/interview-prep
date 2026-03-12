package org.prep.phase1;

import java.util.HashMap;
import java.util.Map;

/**
 * P14 : Find the first non-repeated character in a string
 */
public class P14 {

    public static char firstNonRepeatedChar(String word){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(char ch : word.toCharArray()){
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1 );
        }
        for(Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '$';
    }
    public static void main(String[] args){
        System.out.println(firstNonRepeatedChar("aaaaabbbbbbcccclllllllddd"));
    }
}
