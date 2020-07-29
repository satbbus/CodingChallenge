package CodeSignalBeaconHill;

import java.util.*;

public class camelCase {
    public static void main(String[] args) {
        String input = "isValid";
        String[] words = new String[]{"is","valid","input"};
        System.out.println(camelCaseSeparation(words,input));
    }

   static boolean camelCaseSeparation(String[] words, String variableName) {
       int start =0;
       String word ="";
       Set<String> wordSet = new HashSet<>();
       int wordsSize = words.length;
       int len= variableName.length();

       if(wordsSize == 0 ||  len ==0)   return false;

       for(String element:words){
           wordSet.add(element.toLowerCase());
       }
       // IsValid
    for(int index=0; index<len; index++){
           if(Character.isUpperCase(variableName.charAt(index)) && index >0){
               word =variableName.substring(start, index);
               start=index;
               if(!wordSet.contains(word.toLowerCase()))
                   return false;
           }
           if(index == len-1){
               word =variableName.substring(start, len);
               if(!wordSet.contains(word.toLowerCase()))
                   return false;
           }
       }
     return true;

   }
}