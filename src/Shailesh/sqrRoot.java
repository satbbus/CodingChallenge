package Shailesh;

public class sqrRoot {

    public static void main(String[] args) {

        int input = 25;
        float P = 0.001f;
        System.out.println(squareRoot(input,P));

    }

    public static double squareRoot(int N, float P) {
        double guess = N / 2;

        while( Math.abs( guess*guess - N ) > P) {
            guess  = ( guess + (  N / guess ) ) / 2;
        }
        return guess;
    }
}
