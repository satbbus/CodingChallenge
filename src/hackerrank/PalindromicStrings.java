package hackerrank;

public class PalindromicStrings {


    public static void main(String[] args) {

        String s = "tacocat";
        System.out.println(countPalindromes(s));
    }

   public static int countPalindromes(String s) {
        int result = 0;
        int length = s.length();
        int StartIndex=0,EndIndex=0;
        int sindex2 = 0,eindex2 = 0;
        for(int startIndex = 0;startIndex< length;startIndex++){
                sindex2 = startIndex;
                eindex2 = startIndex;
           while (sindex2 >= 0 && eindex2 < length) {
                    if (s.charAt(sindex2) != s.charAt(eindex2)) break;
                    sindex2--;
                    eindex2++;

                }
            result++;

            sindex2 = startIndex;
            eindex2 = startIndex+1;
            while (sindex2 >= 0 && eindex2 < length) {
                if (s.charAt(sindex2) != s.charAt(eindex2)) break;
                sindex2--;
                eindex2++;

            }
            result++;
        }

        return result;
    }

}
