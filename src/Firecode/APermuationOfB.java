package Firecode;

import java.util.HashMap;
import java.util.Map;

public class APermuationOfB {

    public static void main(String[] args) {
        String s1 = "firecode";
        String s2 = "codefire";

        System.out.println(permutation(s1,s2));
    }


    public static boolean permutation(String str1, String str2) {

        if(str1 == null || str1.equals("") || str2 == null || str2.equals("")) return false;
        if(str1.length() != str2.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str1.length();i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0) + 1);
            //  if(map.get(str1.charAt(i)) == 2) map.remove(str1.charAt(i));
        }
        for(int i = 0;i<str1.length();i++){
            //    map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i),0) + 1);
            if(map.remove(str2.charAt(i)) == null) return false;
        }
    return true;
    }
}
