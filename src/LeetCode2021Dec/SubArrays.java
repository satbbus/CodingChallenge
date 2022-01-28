package LeetCode2021Dec;

import java.util.stream.IntStream;

public class SubArrays {

    public static void main(String[] args) {

        //int[] numbers = {10,2,-2,-20,10};
        int[] numbers = {1,2,3,0};
        //int k = -10;
        int k = 3;
        System.out.println(counSub(numbers,k));
    }

    public static long counSub(int[] nums, int sum){
     long total = 0;
     int tempSum = 0;

        for(int i=0;i<nums.length;i++){
                tempSum = 0;
            for(int j=i;j<nums.length;j++){
                tempSum += nums[j];
                if(tempSum == sum)  {
                    total++;
                }
            }
        }

        return total;
    }
}
