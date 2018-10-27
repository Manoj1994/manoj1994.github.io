//package stacksandqueues;
//
//public class ThreeStacksinanArray {
//
//    private int[] arr;
//    private int[] top;
//    private int[] next;
//    private int size;
//    private int free;
//
//    public ThreeStacksinanArray(int n, int k) {
//        arr = new int[n];
//        this.size = n;
//        top = new int[k];
//        next = new int[n];
//        free = 0;
//
//        for(int i=0;i<n;i++) {
//            top[i] = -1;
//        }
//
//        for(int i=0;i<n;i++) {
//            next[i] = i+1;
//        }
//    }
//
//    public void push(int[] arr, int k) {
//
//        int i = free;
//        free = next[i];
//
//        next[i] = top[k];
//        arr[]
//
//    }
//
//    public int pop(int[] arr, int k) {
//
//        return 1;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//}
