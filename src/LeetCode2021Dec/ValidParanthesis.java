package LeetCode2021Dec;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidParanthesis {

    public static void main(String[] args) {

        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {

        if(s == null || s.length() ==0) return false;
        char[] array1 = s.toCharArray();

        Stack<Character> arrayDeque = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ){
                arrayDeque.push(s.charAt(i));
            }else{
                if((s.charAt(i) == '}' && arrayDeque.size() >0 && arrayDeque.peek() == '{')  ||
                        (s.charAt(i) == ']' && arrayDeque.size() >0 && arrayDeque.peek() == '[') ||
                        (s.charAt(i) == ')' && arrayDeque.size() >0 && arrayDeque.peek() == '(')){
                    arrayDeque.pop();
                }
                else return false;
            }
        }
        if(arrayDeque.size() ==0) return true;
        else return false;
    }



}
