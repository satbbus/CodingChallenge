package codility;

public class MntGanesh {

    public static void main(String[] args) {

        int N = 00000;

        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print != 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

}
