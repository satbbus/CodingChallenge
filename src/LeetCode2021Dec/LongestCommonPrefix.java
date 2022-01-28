package LeetCode2021Dec;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        //String[] strs = {"ab","a"};
        System.out.println(longestprefix(strs));
    }

    public static String longestprefix(String[] strs){
        if(strs.length ==1) return strs[0];
        String prefix = "fl";
        int i=0;
        boolean outerbreak = false;
        int lenofSmallestString = Arrays.stream(strs).map(e->e.length()).min(Integer::compare).get();
        outerloop:
        for(i=0;i<lenofSmallestString;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                break outerloop;
                }
            }
        }
        if(i==0) return "";
        return strs[0].substring(0,i);

    }
}
