package HackerRankFP;

import java.util.*;
import java.util.function.Consumer;

public class MapTest {
    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);

        map.put("Sateesh",list);
        System.out.println(map.toString());
        list.add(2);
        map.put("Sateesh", list);
        System.out.println(map.toString());

        map.computeIfAbsent("Sateesh", o -> new ArrayList<>()).add(3);
        System.out.println(map.toString());

        map.computeIfAbsent("Shailesh", o -> new ArrayList<>()).add(3);
        System.out.println(map.toString());

        map.computeIfAbsent("Sateesh", o -> new ArrayList<>()).add(4);
        System.out.println(map.toString());

        Optional<Integer> opt = null;
        Integer one = null;
        Integer val = opt.ofNullable(one).orElse(20);
        System.out.println(val);

    }
}
