package Shailesh;

import java.util.ArrayList;
import java.util.List;

public class compareStrings {

    public static void main(String[] args) {

        System.out.println(compareStringsfunc("a","b","c"));
        System.out.println(compareStringsfunc("a","c","b"));
        System.out.println(compareStringsfunc("b","a","c"));
        System.out.println(compareStringsfunc("b","c","a"));
        System.out.println(compareStringsfunc("c","a","b"));
        System.out.println(compareStringsfunc("c","b","a"));

        System.out.println(compareStringsfunc("a","b","a"));
        System.out.println(compareStringsfunc("c","b","c"));
        System.out.println(compareStringsfunc("c","b","b"));

    }
    public static String compareStringsfunc(String s1, String s2 , String s3){
        int min = 0;
        int max = 0;


       List<String> list = new ArrayList<>();
       list.add(s1);
       list.add(s2);
       list.add(s3);
       // a b c
       for(int index= 0; index<list.size()-1 ;index++){
           if(list.get(index) .compareTo (list.get(index+1)) > 0){
                min = index;
           }
           if(list.get(index) .compareTo (list.get(index+1)) < 0){
               max = index;
           }
       }
       String temp = list.remove(max);
       return list.remove(min)+list.remove(0)+temp;
}
}