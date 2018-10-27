package general;

import java.util.HashMap;

public class SubArrayWithSumK {

    public int sum(int[] arr, int k) {

        int total_count = 0;
        int length = arr.length;
        for(int i=0; i< length; i++) {
            int cur_sum = 0;
            for(int j =i; j < length; j++) {
                cur_sum += arr[j];
                if(cur_sum == k) {
                    total_count++;
                }
            }
        }
        return total_count;
    }

    public int sumLinearSpace(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int sum = 0;
        int length = arr.length;
        int total_count = 0;
        for(int i=0; i<length; i++) {
            sum += arr[i];
            if(map.containsKey(sum - k)) {
                total_count += map.get(sum-k);
            }
            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum)+1);
            } else {
                map.put(sum , 1);
            }
        }
        return total_count;
    }

    public int linearTime(int[] arr, int k) {

        int total_count = 0, start_index = 0;
        int cur_sum = 0;
        int length = arr.length;
        for(int i=1; i <= length; i++) {

            if(cur_sum > k && start_index < i-1) {
                cur_sum -= arr[start_index];
                start_index++;
            }

            if(cur_sum == k) {
                total_count++;
            }

            if(i < length) {
                cur_sum += arr[i];
            }
        }
        return total_count;
    }



    public static void main(String args[]) {

        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        SubArrayWithSumK subArray = new SubArrayWithSumK();
        int k = 23;
        System.out.println(subArray.sum(arr, k));
        System.out.println(subArray.sumLinearSpace(arr, k));
        System.out.println(subArray.linearTime(arr, k));
    }
}
