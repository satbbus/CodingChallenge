package hackerrank;

public class AlternatingChars {
    public static void main(String[] args) {

        String input = "AAABBB";
        System.out.println(alternatingCharacters(input));

    }

    public static int alternatingCharacters(String s) {
        int count = 0;
        for(int index =0;index < s.length()-1;index++){
            if(s.charAt(index) == s.charAt(index+1))
                count++;
        }
        return count;
    }

}
