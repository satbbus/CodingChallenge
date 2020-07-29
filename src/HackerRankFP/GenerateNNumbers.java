package HackerRankFP;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;





public class GenerateNNumbers {
    @FunctionalInterface
    interface Utils{
        public List<Integer> generateNumbers(int N);
    }

    public static void main(String[] args) {

        String s1 = "sateesh";

        

        Scanner input = new Scanner(System.in);
        //System.out.println("Enter input Number: ");
        int N  = input.nextInt();
        Function<Integer,List<Integer>> func =  n-> IntStream.range(0,N).boxed().collect(Collectors.toList());
        //Utils utils = n-> IntStream.range(0,N).boxed().collect(Collectors.toList());

        //System.out.println(utils.generateNumbers(N));
        System.out.println(func.apply(N));
    }
}
