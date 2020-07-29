package HTCI;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class isPalindromePermutation {

    public static void main(String[] args) {

        String inp = "taco ocat";
        System.out.println(isPalPerm(inp));


    }

    public static boolean isPalPerm(String input){

        int arr[] = new int[128];

        //int arr1[] = {1,2,3};
        //arr.size();
        Set<Character> set = new HashSet<>();

        for(int i = 0;i< input.length();i++){
            char e = input.charAt(i);
            if(Character.isLetter(e))
                if(!set.add(e)) set.remove(e);
        }
    if(set.size()<=1) return true;
    else return false;

    }

}
