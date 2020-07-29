package hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPReverseList {

    public static void main(String[] args) {

       List<Integer> list = IntStream.of(1,2,3,4,5,6,7,8,9,10).boxed().collect(Collectors.toList());

        UnaryOperator<List<Integer>> unaryOperator = input-> {
          List<Integer> list2 = new ArrayList<>();
          for(int i = input.size()-1 ;i >=0 ; i--) list2.add(list.get(i));
          return list2;
        };

        List<Integer> newList = unaryOperator.apply(list);
        System.out.println(newList);
    }
}
