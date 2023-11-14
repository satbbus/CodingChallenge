package CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class UniqCharsInString {

    public static void main(String[] args) {

        String input = "ancbdhrisf";
        System.out.println(isStringHavingUniqChars(input));
    }


    public static boolean isStringHavingUniqChars(String input){
        Set<Character> characterSet = new HashSet<>();
        for(Character ch:input.toCharArray()){
            if(!characterSet.add(ch)){
                return false;
            }
        }
        return true;
    }
}
