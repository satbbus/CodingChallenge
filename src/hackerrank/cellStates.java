package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cellStates {
    public static void main(String[] args) {

        //int[] states = new int[]{1,0,0,0,0,1,0,0};
        int[] states = new int[]{1,1,1,0,1,1,1,1};
        List<Integer> list = cellComplete(states,2);
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }


    public static List<Integer> cellComplete(int[] states, int days) {

        int inputLen = states.length;
        List<Integer> list = new ArrayList<>(inputLen);
        int temp = -1;
        int temp2 = -1;


        for (int daysIndex = 0; daysIndex < days; daysIndex++) {
            temp =-1;
            temp2 = -1;
            for (int cellIndex = 0; cellIndex < inputLen; cellIndex++) {
                // 1 0 0 0 0 1 0 0
                if (cellIndex == 0) {
                    temp = states[cellIndex];
                    states[cellIndex] = states[cellIndex + 1];
                    //list.add(states[cellIndex+1]);
                } else if (cellIndex == inputLen - 1) {
                    states[cellIndex] = temp;
                    //list.add(temp);
                } else {
                    //0  [1] [1] [1] [0] [1] [1] [1] [1] 0
                    //   1   0    1   0   1   0   0   1
                    //list.add(temp ^ states[cellIndex+1]);
                    temp2 = states[cellIndex];
                    states[cellIndex] = temp ^ states[cellIndex + 1];
                    temp = temp2;
                }
            }
        }

        return IntStream.of(states).boxed().collect(Collectors.toList());
    }
}
