package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EffectivelyFinal {

    public static void main(String[] args) {

        String s = "effectively final ";

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);


        Runnable r = ()-> {
            String s2 = s+"well--  ";
            System.out.println(s+" yes/no?");
            list.add(20);
            //list = new ArrayList<>();

        };
        System.out.println("------1-------------------");
        Thread th = new Thread(r);
        th.start();
        for(Integer i: list)
            System.out.println(i);
        System.out.println("-------2------------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        Function<ArrayList<Integer>,ArrayList<Integer>> func = l1-> {l1.add(25); return l1;};
        list2 = func.apply(list);
        System.out.println("------3-------------------");
        for(Integer i: list2)
            System.out.println(i);

    }

}
