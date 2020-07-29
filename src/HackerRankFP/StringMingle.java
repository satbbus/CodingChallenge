package HackerRankFP;

import java.util.stream.IntStream;

public class StringMingle {

    public static void main(String[] args) {

        String s1= "abc";
        String s2 = "xyz";
        StringBuffer sb = new StringBuffer();
        IntStream.range(0,s1.length()).forEach(e-> sb.append(s1.charAt(e)).append(s2.charAt(e)));
        //res=res.append(o1.charAt(i)).append(o2.charAt(i)

        System.out.println(sb.toString());

    }
}
