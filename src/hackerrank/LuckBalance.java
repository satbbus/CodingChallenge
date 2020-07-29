package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {


    static int luckBalance(int k, int[][] contests) {
        int balance = 0;
        List<Integer> imp = new ArrayList<>();
        //1. seperates imp contests
        for(int index= 0; index< contests.length;index++){
            if(contests[index][1] == 1) imp.add(contests[index][0]);
            else if(contests[index][1] == 0) balance = balance + contests[index][0];
        }
        Collections.sort(imp,(o1,o2)-> o2-o1);
        for(int kindex = 0; kindex < imp.size(); kindex++){
            if(kindex <k)
            balance = balance + imp.get(kindex);
            else
                balance = balance - imp.get(kindex);
        }
         return balance;
    }

}
