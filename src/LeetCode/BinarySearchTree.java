package LeetCode;

import java.util.ArrayDeque;
import java.util.function.BinaryOperator;

class TreeNode{

    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.value = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    public void insert(int element){
       root = addNode(root,element);

    }
    public TreeNode addNode(TreeNode root, int element){
        if(root == null){
            return new TreeNode(element);
        }
        if(element < root.value){
            root.left = addNode(root.left,element);
        }
        else if(element>root.value){
            root.right = addNode(root.right,element);
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value+" ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(root.value+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root != null){

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value+" ");
        }
    }

    public void levelTraversal(TreeNode root){
        if(root == null) return;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        //int qSize = queue.size();
        while(queue.size()>0){ // 4,3,7
            TreeNode element = queue.remove();
            System.out.println(element.value+" ");
            root = element;
            if(root.left != null)
                queue.add(root.left);
            if(root.right != null)
                queue.add(root.right);

        }

    }
    public static TreeNode  root;
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] elements = new int[]{4,7,3,5,9,10,2,8};
        for(int e:elements) {
          //  System.out.print(e+" ");
            bst.insert(e);
        }
  /*      System.out.println("\nIn Order");
        bst.inOrderTraversal(root);
        System.out.println("\nPre Order");
        bst.preOrderTraversal(root);
        System.out.println("\nPost Order");
        bst.postOrderTraversal(root);*/
        bst.levelTraversal(root);
    }
/*
               4
            /    \
         3         7
       /        /   \
     2         5      9
                     /  \
                   8     10

4 3 7 2 5 9 8 10   qeue = 3|7|2|3.5|
leveltraversal(root =3 )
//print(root)
while(root!=null) {
print(root)
queue.add(root.left)
queue.add(root.right)
root = root.left

}
 */
}
