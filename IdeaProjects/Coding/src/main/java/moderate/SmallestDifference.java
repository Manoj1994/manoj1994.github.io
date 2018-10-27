package moderate;
import java.util.Arrays;

public class SmallestDifference {

    public int differenceBruteForce(int a[], int b[]) {

        int difference =  Integer.MAX_VALUE;

        for(int i=0; i< a.length; i++) {
            for(int j=0; j<b.length; j++) {
                if(Math.abs(a[i] - b[j]) < difference) {
                    difference = Math.abs(a[i] - b[j]);
                }
            }
        }

        return difference;
    }

    public int differenceOptimal(int[] a, int[] b) {
        int difference = Integer.MAX_VALUE;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;

        while( i< a.length && j < b.length ) {
            if(Math.abs(a[i] - b[j]) < difference) {
                difference = Math.abs(a[i] - b[j]);
            }

            if(a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return difference;
    }

    public static void main(String[] args) {

        SmallestDifference difference = new SmallestDifference();
        int[] a = {1, 2, 11, 15};
        int[] b = {4, 12, 19, 23, 127, 235};
        System.out.println(difference.differenceBruteForce(a, b));
        System.out.println(difference.differenceOptimal(a, b));
    }
}
