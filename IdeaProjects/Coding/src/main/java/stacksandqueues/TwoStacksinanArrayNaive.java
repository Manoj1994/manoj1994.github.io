package stacksandqueues;

public class TwoStacksinanArrayNaive {

    private int[] arr;
    private int size;
    private int size1, size2;
    private int top1, top2;

    public TwoStacksinanArrayNaive(int size) {
        this.size = size;
        if(size%2==0) {
            this.size1 = size/2;
            this.size2 = size/2;
        } else {
            this.size1 = size/2;
            this.size2 = size/2+1;
        }
        top1 = -1;
        top2 = this.size1-1;
    }

    public void push1(int val) {
        if(top1 < size1-1) {
            top1++;
            arr[top1] = val;
        } else {
            System.out.println("Stack1 overflow");
        }
    }

    public void push2(int val) {
        if(top2 < size2-1) {
            top2++;
        }
    }
}
