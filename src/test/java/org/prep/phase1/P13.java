package org.prep.phase1;

/**
 * P13 : Check if a string is a Palindrome (handle alphanumeric and case sensitivity).
 */
public class P13 {

    public boolean checkPalindrome(String word){
        if(word.isEmpty()){
            return false;
        }
        char[] wordArray = word.toCharArray();
        int i = 0;
        int j = word.length() - 1;

        while (i < j){
            if(wordArray[i] == wordArray[j]){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String word = "maDam";
        P13 obj = new P13();
        if(obj.checkPalindrome(word.toLowerCase()))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
