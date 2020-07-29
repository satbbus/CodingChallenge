package HTCI;

import java.util.HashMap;
import java.util.Map;

public class ArePermutations {
    public static void main(String[] args) {
        String s1 = "sateesh";
        String s2 = "sateeha";
        boolean check = arePermutations(s1,s2);
        System.out.println(check);
    }

    public static boolean arePermutations(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        Map<Character,Integer> hashMap = new HashMap<>();

        for(int i =0;i<s1.length();i++){
            hashMap.put(s1.charAt(i),hashMap.getOrDefault(s1.charAt(i),0) + 1);
        }
        for(int i =0;i<s2.length();i++){
            if(hashMap.containsKey(s2.charAt(i)))
            hashMap.remove(s2.charAt(i));
        }
        if(hashMap.isEmpty()) return true;
        else return false;

    }

}
