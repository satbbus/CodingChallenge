package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DPMaxArraySum {
    public static void main(String[] args) {

    }

    public static int maxSubsetSum(int[] arr) {
        int maxSum = 0;
        List<Integer> arlist = IntStream.of(arr).boxed().collect(Collectors.toList());
        int temp1=0,temp2=0;
        for(int i =0;i< arr.length ;i++){
            if(i%2 ==0)
            temp1 +=  arr[i];
            else{
                temp2 += arr[i];
            }
        }


        return maxSum;
    }
}
