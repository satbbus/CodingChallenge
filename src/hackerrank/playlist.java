package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class playlist {

    public static void main(String[] args) {
        //int[] input = new int[]{60,60,60};
       // int[] input = new int[]{30,20,150,100,40};
       // List<Integer> numbers = IntStream.of(input).boxed().collect(Collectors.toList());
      //  System.out.println(playlist(input));
    }

    public static long playlist(int[] songs) {

        int reminder = 0;
        int compliment = 0;
        int counter = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int index = 0;index<songs.length;index++)
        {   //30,20,150,100,40 / 60 60 60
            reminder = songs[index]%60;
            compliment  = 60 - reminder;
            counter = counter + hm.getOrDefault(compliment,0);
            if(hm.containsKey(compliment)) hm.put(compliment, hm.get(compliment) + 1);
            else hm.put(compliment, 1);
     }
    return counter;
    }
}
