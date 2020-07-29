package LeetCode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String input = "babad";
        System.out.println(longest(input));
    }
    public static String longest(String s){
        String longString= "";
        int max = 0;
        int len = s.length();
        int start=0,end=0;
        for(int i = 0;i<len ; i++){
            start = i;
            end = i;
        while(start >= 0 && end < len){
            if(s.charAt(start) != s.charAt(end)) break;
            else{
                start--;
                end++;
            }
        }
            if(start <0) {start++;}
            if(max < end-start){
                max = end-start;

                longString = s.substring(start,end);
                System.out.println(longString);
            }
        }
        return longString;
    }
}
