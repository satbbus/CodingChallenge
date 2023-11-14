package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] elements = {4,1,7,3,90,65,4,6,87,12};

        System.out.print("before:");
        for (int element:
             elements) {
            System.out.print(element+",");
        }
        System.out.println(bullblesort(elements));

        System.out.print("after:");
        for (int element:
                elements) {
            System.out.print(element+",");
        }

    }

    private static int[] bullblesort(int[] elements) {
        int temp  = -1;

        for (int i = 0; i < elements.length-1; i++){
            for(int j=0;j<elements.length-i-1;j++) {
                if (elements[j] > elements[j + 1]) {
                    temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
                for (int element :
                        elements) {
                    System.out.print(element + ",");
                }
                System.out.println();
            }
        }
        return elements;

    }

}
