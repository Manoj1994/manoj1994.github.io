package recursion;

public class Fibonacci {


    public int fibonacci(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int fibonacciLinearSoaceLinearTime(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0; arr[1] = 1;
        for(int i=2;i<=n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public int fibonaccuLinearTime(int n) {
        int i=1,j=0;
        for(int k=1;k<=n;k++) {
            j = j+i;
            i = j-i;
        }
        return j;
    }

    public int fibonacciLogarithmic(int n) {

        int i=1, j=0;
        int k=0, h=1;
        int t = 0;
        while(n > 0) {
            if(n%2 == 1) {
                t = j*h;
                j = t*h + j*k + t;
                i = i*k + t;
            }
            t = h*h;
            h = 2*h*k + t;
            k = k*k + t;
            n = n/2;
        }
        return j;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(10));
        System.out.println(fibonacci.fibonacciLinearSoaceLinearTime(10));
        System.out.println(fibonacci.fibonaccuLinearTime(10));
        System.out.println(fibonacci.fibonacciLogarithmic(10));
    }
}
