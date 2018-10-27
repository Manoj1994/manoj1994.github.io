package sortingandsearching;

public class SearchInaSortedRotatedArray {


    public int binarySearch(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {

            int mid = (low + high) /2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] <= arr[high]) {
                if(target > arr[mid] && target <= arr[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            } else {
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {10, 11, 12, 13, 14, 1, 2, 3, 4, 5, 6, 7, 8};
        SearchInaSortedRotatedArray search = new SearchInaSortedRotatedArray();
        System.out.println(search.binarySearch(arr, 9));

    }
}
