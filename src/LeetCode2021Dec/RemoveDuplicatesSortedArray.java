package LeetCode2021Dec;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int nums[]){

        if(nums.length == 0) return 0;
        int finalcount = 0;
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(i==j) nums[j]= '_';

            }


        }



        return finalcount;
    }

}
//uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu

