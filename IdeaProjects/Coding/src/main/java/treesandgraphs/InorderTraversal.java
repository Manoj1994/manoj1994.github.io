package treesandgraphs;
import java.util.*;

public class InorderTraversal {

    private Node root;
    private List<Integer> output;

    public InorderTraversal(Node root) {
        this.root = root;
        this.output = new ArrayList<>();
    }

    public void traverse(Node root) {

        if(root == null) {
            return;
        }

        traverse(root.left);
        this.output.add(root.val);
        traverse(root.right);

    }

    public List<Integer> getList() {
        return this.output;
    }
}
