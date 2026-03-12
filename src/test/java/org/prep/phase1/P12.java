package org.prep.phase1;

/**
 * P12 : Reverse words in a given sentence (e.g., "I love Java" -> "Java love I").
 */
public class P12 {

    public static String reverseSentence(String sentence){

        if(sentence.isEmpty()){
            return "Sentence is Blank";
        }
        String[] words = sentence.split(" ");

        if(words.length == 1){
            return sentence;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            if(i != 0){
                builder.append(words[i]).append(" ");
            } else {
                builder.append(words[i]);
            }
        }
        return builder.toString();
    }

    public static void main (String[] args){
        String sentence = "I love Java Programming";
        System.out.println(reverseSentence(sentence));
    }
}
