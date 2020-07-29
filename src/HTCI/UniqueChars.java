package HTCI;

public class UniqueChars {

    public static void main(String[] args) {
        String input = "abcedfghijklmnopqrstuvwxy";
        System.out.println(isUniqCharString(input));


    }

    public static boolean isUniqCharString(String s) {

        int[] ar = new int[125];

        for (int i = 0; i < s.length(); i++) {
            ar[s.charAt(i)] += 1;
            if (ar[s.charAt(i)] > 1) return false;
        }
        return true;
    }

}
