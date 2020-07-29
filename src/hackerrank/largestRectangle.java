package hackerrank;

public class largestRectangle {

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        System.out.println(largestRectangle(input));
    }

    public static long largestRectangle(int[] h){
        long largestRect = 0L;
        return findLargeRect(h,0,h.length,largestRect);

    }

    public static long findLargeRect(int[] h,int start, int end,long largestRect){
        if(end-start<=0) return 0;
        if(h.length == 1) return h[0];
        // 1,2 3, 4, 5

        int smallBuildingIndex = smallestElement(h,start, end);
        long temp = h[smallBuildingIndex] * (end-start);
        if(largestRect<temp) largestRect = temp;

        temp = findLargeRect(h,0,smallBuildingIndex-1,largestRect);
        if(largestRect<temp) largestRect = temp;
        temp = findLargeRect(h,smallBuildingIndex+1,h.length,largestRect);
        if(largestRect<temp) largestRect = temp;

        return largestRect;
    }

    public static int smallestElement(int[] subH,int start,int end){

        int minIndex = start;
        int min = subH[start];

        for(int index = start+1;index<end;index++){
            if(subH[index]< min) {
                min = subH[index];
                minIndex = index;
            }
        }

    return minIndex;
    }

}
