package Shailesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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


        List<String> l1 = Arrays.asList("x", "y");
        List<String> l2 = Arrays.asList("1", "2");
        //Stream.of(l1, l2).forEach((x)->System.out.println(x));

        //Stream.of(l1, l2).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));
        Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.println(x));


    }
    public static String compareStringsfunc(String s1, String s2 , String s3){
        int min = 0;
        int max = 0;


       List<String> list = new ArrayList<>();
       list.add(s1);
       list.add(s2);
       list.add(s3);

        System.out.println("hello - list -->"+list.stream().distinct().count());
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