package HTCI;

public class MissingNumber {

    public static void main(String[] args) {

        int num[] = new int[]{10,8,3,4,6,7,2,9,1};
        int num2[] = new int[num.length+1];

        for(int index = 0; index<num.length+1;index++){
            num2[num[index]] =1;
        }
        for(int index = 0; index<num2.length;index++){
            if(num2[index] == 0 && index != 0)
            System.out.println(index);
        }
    }
}
