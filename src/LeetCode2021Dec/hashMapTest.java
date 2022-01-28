package LeetCode2021Dec;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class hashMapTest {

    public static void main(String[] args) {
        List<String>  words = Arrays.asList("Hi",  "Hello","Hai", "Hi", "Bye", "Hello","Hai", "Hi", "Hello","Hai");
        sortByValueUsingMap(words);
        //sortByValueUsingMap(words);
        //sortByPriorityQueue(words);
    }

    private static void sortByValueUsingMap(List<String>  words) {
        Map<String, Integer> countMap = new LinkedHashMap<String, Integer>();

        Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        Map<String, Integer> hm = new LinkedHashMap<String, Integer>();



        words.stream()
                .forEach(word -> countMap.compute(word, (k,v) -> v == null ? 1 : ++v));
        System.out.println(countMap);

        Map<Integer, String> valueMap = new TreeMap<>((o1,o2) -> o2 > o1 ? o2 : o1);
        countMap.entrySet().stream()
                .forEach(entrySet -> valueMap.compute(entrySet.getValue(), (k,v) -> entrySet.getKey()));
        System.out.println(valueMap);
        System.out.println(valueMap.values().stream().collect(Collectors.toList()));
    }

}
