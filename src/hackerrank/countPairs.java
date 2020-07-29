package hackerrank;

import jdk.internal.util.xml.impl.Pair;
import java.util.*;

public class countPairs {

    public static void main(String args[])
    {
        //Integer inputA[] = {1, 3, 1, 5, 4};
        //Integer inputA[] = {1, 2, 3, 4,5};
        Integer inputA[] = {3, 1, 4, 1, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(inputA));
        System.out.println(countPairss(list,2));
    }
    public static int countPairss(List<Integer> input, int k)
    {
        int counter = 0;
        HashSet<Integer> hsA = new HashSet<>();
        HashSet<Integer> hsB = new HashSet<>();
        List<Pair> ret = new ArrayList<>();
        Iterator<Integer> it = input.iterator();
        HashMap<Integer,Integer> hm = new HashMap<>();
        Integer item,temp;
        if(k==0) {
            while(it.hasNext()){
                item = it.next();
                if(hm.containsKey(item))  {
                    if(hm.get(item) == 1){
                        counter++;
                        hm.put(item,2);
                    }
                }
                else hm.put(item,1);

            }
        }

    else {
            while (it.hasNext()) {
                Integer element = it.next();
                hsA.add(element);
                hsB.add(element + k);
            }

            for (int firstElement : hsB) {
                if (hsA.contains(firstElement)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int findPairs(int[] nums, int k) {

        if (k < 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i : nums) {
            if (map.containsKey(i)) {
                if (k == 0 && map.get(i) == 1) {
                    map.put(i, map.get(i) + 1);
                    res++;
                }
                continue;
            }
            //{3, 1, 4, 1, 5}; 2
       res += map.getOrDefault(i + k, 0);
            res += map.getOrDefault(i - k, 0);
            map.put(i, 1);
        }
        return res;

    }
}
