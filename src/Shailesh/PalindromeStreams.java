package Shailesh;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeStreams {

    public static void main(String[] args) {
        System.out.println(isPalindrome("mappak"));
    }

    public static boolean isPalindrome(String s){

        List<String> list = new ArrayList<>();
        //IntStream.rangeClosed(0,6).forEach(System.out::println);
        long count = 0;
        int len = s.length();
        count = IntStream
                    .rangeClosed(0,len/2)
                    .filter(i->s.charAt(i) == s.charAt(len-i-1) && i<= (len-i)) // s a  t e e s h
                    .count();
        System.out.println("count ="+count);
        if(count == (s.length()/2)+1) return true;
        else return false;

    }
}
