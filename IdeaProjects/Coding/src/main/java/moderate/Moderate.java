package moderate;

public class Moderate {


    public void swap(int a, int b) {


        System.out.println(a+" "+b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println(a+" "+b);

    }

    public void swapXOR(int a, int b) {

        System.out.println(a+" "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a+" "+b);
    }


    public static void main(String[] args) {
        Moderate moderate = new Moderate();
        moderate.swap(3,5);
        moderate.swapXOR(3, 4);
    }
}
