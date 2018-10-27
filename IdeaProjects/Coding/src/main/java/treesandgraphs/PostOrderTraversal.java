package treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    private Node root;
    private List<Integer> output;

    public PostOrderTraversal(Node root) {
        this.root = root;
        this.output = new ArrayList<>();
    }

    public void traverse(Node root) {

        if(root == null) {
            return;
        }
        traverse(root.left);
        traverse(root.right);
        this.output.add(root.val);
    }

    public List<Integer> getList() {
        return this.output;
    }
}
