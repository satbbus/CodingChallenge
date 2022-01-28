package LeetCode2021Dec;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToInteger {

    public static void main(String[] args) {
        int total = 0;
        char previous = ' ';
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        char[] input = "MCMXCIV".toCharArray(); //"IX"
        for(int i=input.length-1;i>=0;i--){

            if(i<input.length-1 && i>-1 && hm.get(input[i]) < hm.get(previous))
                total = total - hm.get(input[i]);
            else
                total = total + hm.get(input[i]);
            previous = input[i];
        }
        System.out.println(total);
    }

}
