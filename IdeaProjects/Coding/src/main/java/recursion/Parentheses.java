package recursion;
import java.util.*;

public class Parentheses {

    public void generateParentheses(String s,int start, int end, List<String> output) {

        if(start > end) {
            return;
        }

        if(start == 0 && end == 0) {
            output.add(s);
        }

        if(start > 0) {
            generateParentheses(s+'(',start-1, end, output);
        }
        if(end > 0) {
            generateParentheses(s+')', start, end-1, output);
        }

    }

    public static void main(String[] args) {

        Parentheses parentheses = new Parentheses();
        List<String> output = new ArrayList<String>();
        parentheses.generateParentheses("", 3, 3, output);
        for(int i=0;i<output.size();i++) {
            System.out.println(output.get(i));
        }

    }
}
