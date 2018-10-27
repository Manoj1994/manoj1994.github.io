package recursion;
import java.util.*;

public class Subsets {

    public void generateSubsets(int n) {

        int subsetSize = (1 << n);
        for(int i=0;i<subsetSize;i++) {
            for(int j=0;j<n;j++) {
                if((i & (1 << j)) > 0) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void generateSubsetsBacktrack(int[] arr, List<List<Integer>> output, List<Integer> temp, int start) {

        int length = arr.length;

        for(int i=start;i<length;i++) {
            temp.add(arr[i]);
            output.add(new ArrayList<>(temp));
            generateSubsetsBacktrack(arr, output, temp, i+1);
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String[] args) {

        Subsets sets = new Subsets();
        int n = 3;
        int arr[] = {1, 2, 3};
        //sets.generateSubsets(n);
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        sets.generateSubsetsBacktrack(arr, output, new ArrayList<Integer>(), 0);

        output.add(new ArrayList<>());

        for(int i=0;i<output.size();i++){
            List<Integer> list = output.get(i);
            for(int j=0;j<list.size();j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}
