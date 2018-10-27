package treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    private Node root;
    private List<Integer> output;

    public PreOrderTraversal(Node root) {
        this.root = root;
        this.output = new ArrayList<>();
    }

    public void traverse(Node root) {

        if(root == null) {
            return;
        }
        this.output.add(root.val);
        traverse(root.left);
        traverse(root.right);

    }

    public List<Integer> getList() {
        return this.output;
    }
}
