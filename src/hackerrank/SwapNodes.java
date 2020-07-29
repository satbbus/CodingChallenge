package hackerrank;

import sun.reflect.generics.tree.Tree;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        value = val;
        left = null;
        right = null;
    }
}

public class SwapNodes {
    public static void main(String[] args) {


    }

    // (2,3)  (-1,-1), (-1,-1)
    static int[][] swapNodes(int[][] indexes, int[] queries) { //1,1
        TreeNode root = new TreeNode(1);
        TreeNode current = root;
        int counter = 0;
        for (int index = 0; index < indexes.length; index++) {
            if (indexes[index][0] != -1) current.left = new TreeNode(indexes[index][0]);
            counter++;
            if (indexes[index][0] != -1) current.right = new TreeNode(indexes[index][0]);
            counter++;
        }

        int currentDepth = 0;
        int reqDepth = 0;
        int nodeCount = 0;


        for (int qindex = 0; qindex < queries.length; qindex++) {
            reqDepth = queries[qindex];
            currentDepth = 3;
            for (int index = 0; index < indexes.length; index++) {
                if (reqDepth == 1) {
                    int temp = indexes[index][0];
                    indexes[index][0] = indexes[index][1];
                    indexes[index][1] = temp;
                    break;
                }
                if (reqDepth == currentDepth) {
                    int temp = indexes[index + 1][0];
                    indexes[index + 1][0] = indexes[index + 1][1];
                    indexes[index][1 + 1] = temp;
                    temp = indexes[index + 2][0];
                    indexes[index + 2][0] = indexes[index + 2][1];
                    indexes[index + 2][2 + 1] = temp;

                    break;
                }

                if (indexes[index + 1][0] != -1) nodeCount++;
                if (indexes[index + 1][1] != -1) nodeCount++;
                if (indexes[index + 2][0] != -1) nodeCount++;
                if (indexes[index + 2][1] != -1) nodeCount++;

                if (nodeCount > 0) {
                    index = index + nodeCount;
                    currentDepth += 1;
                }

            }


        }
        return null;
    }
}