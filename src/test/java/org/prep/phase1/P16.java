package org.prep.phase1;

import java.util.HashMap;
import java.util.Map;

/**
 * P16 : Check if two strings are Anagrams of each other.
 */
public class P16 {

    public static boolean checkAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();

        for(char ch : word1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }



        for(char ch : word2.toCharArray()){

            if(!map1.containsKey(ch)){
                return false;
            }

            map1.put(ch, map1.get(ch) - 1);

            if(map1.get(ch) == 0){
                map1.remove(ch);
            }
        }

        return map1.isEmpty();
    }

    public static void main(String[] args){
        String word1 = "mama";
        String word2 = "ammi";
        System.out.println(checkAnagram(word1, word2));
    }
}
