package stacksandqueues;

public class TwoStacksinanArray {

    private int[] arr;
    private int size;
    private int top1, top2;

    public TwoStacksinanArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    public void push1(int val) {
        if(top1 < top2-1) {
            top1++;
            arr[top1] = val;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int val) {
        if(top1 < top2-1) {
            top2--;
            arr[top2] = val;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int peek1() {
        if(top1 > 0) {
            return arr[top1];
        } else {
            System.out.println("Stack 1 ins empty");
            return -999;
        }
    }

    public int peek2() {
        if(top2 < size) {
            return arr[top2];
        } else {
            System.out.println("Stack 2 is empty");
            return -999;
        }
    }

    public int pop1() {
        if(top1 > 0) {
            int temp = arr[top1];
            arr[top1] = 0;
            top1--;
            return temp;
        } else {
            System.out.println("Stack1 is empty");
            return -999;
        }
    }

    public int pop2() {
        if(top2 < size) {
            int temp = arr[top2];
            arr[top2] = 0;
            top2++;
            return temp;
        } else {
            System.out.println("Stack2 is empty");
            return -999;
        }
    }

    public void printArray() {
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {

        TwoStacksinanArray stack = new TwoStacksinanArray(3);
        stack.printArray();
        stack.push1(1);
        stack.printArray();
        stack.push2(3);
        stack.printArray();
        stack.push1(2);
        stack.printArray();
        stack.pop1();
        stack.printArray();
        stack.push2(4);
        stack.printArray();

    }
}
