package general;

public class LargestSubarrayWithSumK {

    public int sumBruteForce(int[] arr, int k) {

        int maxSize = 0, cur_sum = 0;
        int length = arr.length;
        for(int i=0 ;i< length; i++) {
            cur_sum = 0;
            for(int j=i; j<length; j++) {
                cur_sum += arr[j];
                if(cur_sum == k) {
                    if(j-i+1 > maxSize) {
                        maxSize = j-i+1;
                    }
                }
            }
        }
        return maxSize;
    }

    public int sumLinearSpace(int[] arr, int k) {

        int maxSize = 0, cur_sum = arr[0];
        int length = arr.length;

        int start =0;
        for(int i=1; i<=length; i++) {
            if(cur_sum > k && start < i-1) {
                cur_sum -= arr[start];
                start++;
            }
            if(cur_sum == k) {
                if(i - start +1 > maxSize) {
                    maxSize = i-start+1;
                }
            }
            if(i < length) {
                cur_sum += arr[i];
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        LargestSubarrayWithSumK sumArr = new LargestSubarrayWithSumK();
        int arr[] = {10, 5, 2, 7, 1, 9};
        int sum = 15;
        System.out.println(sumArr.sumBruteForce(arr, sum));
        System.out.println(sumArr.sumBruteForce(arr, sum));
    }
}
