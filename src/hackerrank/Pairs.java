package hackerrank;

import java.util.HashMap;

public class Pairs {

    public static void main(String[] args) {
        int arr[] = new int[]{1,5,3,4,2};
        int k = 2;
        System.out.println(pairs(k,arr));

    }

    static int pairs(int k, int[] arr) {
        int result = 0;
        int diff1 = 0,diff2 =0;
        int hmvalue =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            diff1 = arr[i] - k;
            diff2 = arr[i] + k;
            if(hm.containsKey(diff1)) {
                //hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                result += hm.get(diff1);
            }
            if(hm.containsKey(diff2)) {
                //hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                result += hm.get(diff2);
            }
           hm.put(arr[i],hm.getOrDefault(arr[i],0) + 1);

        }
        return result;
    }


}
