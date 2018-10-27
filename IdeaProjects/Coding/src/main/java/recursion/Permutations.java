package recursion;

import java.util.*;

public class Permutations {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> addList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public void generatePermutations(int[] arr, List<List<Integer>> output, int start, int end) {

        if(start == end) {
            output.add(addList(arr));
            return;
        }

        for(int i = start; i<=end; i++) {
            swap(arr, i, start);
            generatePermutations(arr, output, start+1, end);
            swap(arr,i , start);
        }

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        List<List<Integer>>  output = new ArrayList<>();

        Permutations permutations = new Permutations();
        permutations.generatePermutations(arr, output, 0, arr.length-1);

        for(int i=0;i<output.size();i++) {
            List<Integer> list = output.get(i);
            for(int j=0;j<list.size();j++) {
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}
