package LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalNum(23));
    }

    public static boolean isPalNum(int num){
        String s = "", srev = "";
        if(num < 0) return false;
        else if(num<10) return true;
        s = String.valueOf(num);
        char[] arr = s.toCharArray();
        for(int i = s.length()-1;i>=0;i--)
            srev = srev + arr[i];
        return s.equals(srev);

    }
}
