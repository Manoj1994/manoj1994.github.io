package sortingandsearching;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        while(m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m = m - 1;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n = n - 1;
            }
        }

        while(n > 0) {
            nums1[n-1] = nums2[n-1];
            n = n-1;
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 4, 5, 6, 0, 0, 0, };
        int b[] = {2, 3, 7};

        MergeSortedArrays m = new MergeSortedArrays();
        m.merge(a, 4, b, 3);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
