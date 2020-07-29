package hackerrank;

import java.util.Arrays;

public class AbsoluteDifference {

    public static void main(String[] args) {

        int arr[] = new int[]{-59, -36, -13, 1 ,-53, -92, -2, -96, -54, 75};
        //int arr[] = new int[]{1, -3, 71, 68, 17};
        System.out.println(minimumAbsoluteDifference(arr));

    }

    static int minimumAbsoluteDifference(int[] arr) {
        int diff = 0;
        int tempDiff = 0;
        Arrays.sort(arr);
        diff = Math.abs(arr[0]-arr[1]);
        for(int index1 = 0;index1< arr.length-1 ;index1++){
             tempDiff = Math.abs(arr[index1] - arr[index1+1]);
                 if(diff >  tempDiff)
                    diff = tempDiff;
            }
        return diff;
    }
}
