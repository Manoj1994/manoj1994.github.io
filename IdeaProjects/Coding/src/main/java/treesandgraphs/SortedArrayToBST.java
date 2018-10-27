package treesandgraphs;
import java.util.*;

public class SortedArrayToBST {

    public Node creatBST(int start, int end, int[] arr) {

        if(start > end) {
            return null;
        }

        int mid = (start) + (end - start)/2;
        Node root = new Node(arr[mid]);
        root.left = creatBST(start, mid-1, arr);
        root.right = creatBST(mid+1, end, arr);
        return root;

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        SortedArrayToBST bst = new SortedArrayToBST();
        Node root = bst.creatBST(0, arr.length-1, arr);
        InorderTraversal inorder = new InorderTraversal(root);
        inorder.traverse(root);
        List<Integer> output = inorder.getList();
        for(int i : output) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
