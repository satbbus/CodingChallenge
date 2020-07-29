package HTCI;

public class URLify {
    public static void main(String[] args) {
        String input = "one two three four";

        System.out.println(spaceToPercent20(input));
    }

    public static String spaceToPercent20(String input){

        //char[] arr = new char[input.length()*2];
        int spaceCounter = 0;
        int len = input.length();
        for(int i = 0;i<input.length() ; i++) {
            if(input.charAt(i) == ' ') {
                spaceCounter++;
            }
        }
        int newLen = input.length() + (spaceCounter *2)-1;
        char[] arr = new char[newLen+1];

    //sateesh bandi b
        for(int i = len-1;i>=0 ; i--){

            if(input.charAt(i) == ' '){
                arr[newLen-2] = '%';
                arr[newLen-1] = '2';
                arr[newLen] = '0';
                newLen = newLen -3;
                }
            else{
                arr[newLen--] = input.charAt(i);
            }

        }

        return String.valueOf(arr);


    }

}
