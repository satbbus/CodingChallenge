package CodeSignal;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysSimilar {

    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {2,1,3};

        System.out.println(areSimilar(a,b));
    }

    static boolean areSimilar(int[] a, int[] b) {
        //int[] a = {1,1,4};
        //int[] b = {1,2,3};
        if (a.length != b.length) return false;
        int num1 = -1;
        int num2 = -1;
        int count = 0;
        int diffcount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if(count ==0 ){
                    num1 = a[i];
                    num2 = b[i];
                    count++;
                    continue;
                }
                if (num1 == b[i] && num2 == a[i]) {
                    count++;
                    num1 = -1;
                    num2 = -1;
                } else {
                    return false;
                }
            }
            if(count>2) return false;
        }
        return true;
    }
}





/*
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
 */
