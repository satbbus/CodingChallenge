package hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FraudulentActivity {

    public static void main(String[] args) {

        //int[] expenditure = new int[]{10,20,30,40,50};
        int[] expenditure = new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
        int d = 5;
        System.out.println(activityNotifications(expenditure,d));
    }

    static int activityNotifications(int[] expenditure, int d) {
        int FraudTxns = 0;
        List<Integer> list = IntStream.of(expenditure).boxed().collect(Collectors.toList());
        List<Integer> tempList = new ArrayList<>(d);
        int totaldays = expenditure.length;
        int median = 0;
        int subListSize = 0;
        int[] ab = new int[d+1];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> a-b);
        for(int i = 0;i < totaldays;i++){
            while(i<d) minHeap.add(expenditure[i]);
            if(i-d > 0){
                // minHeap.toArray(a);


                minHeap.remove(expenditure[i-d]);


            }
            else {

            }

            if(d%2 ==0){
                median = tempList.get(subListSize/2)+tempList.get(subListSize/2+1);
            }
            else{
                median = tempList.get(subListSize/2);
            }
            if(median *2 <= expenditure[i])  FraudTxns++;
        }
        return FraudTxns;
    }


    static int activityNotificationsver1(int[] expenditure, int d) {

        int FraudTxns = 0;
        List<Integer> list = IntStream.of(expenditure).boxed().collect(Collectors.toList());
        List<Integer> tempList = new ArrayList<>(d);
        int totaldays = expenditure.length;
        int median = 0;
        int subListSize = 0;
        for(int i = d;i< totaldays;i++){
            //tempList.clear();
            tempList = list.subList(i-d,i);
            Collections.sort(tempList);
            subListSize = tempList.size();
            if(d%2 ==0){
                median = tempList.get(subListSize/2)+tempList.get(subListSize/2+1);
            }
            else{
                median = tempList.get(subListSize/2);
            }
            if(median *2 <= expenditure[i])  FraudTxns++;
        }
        return FraudTxns;
    }

}
