package bitmanipulation;

public class AddIntegers {

    public int add(int a, int b) {

        while(b!=0) {
            int carry = a & b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        AddIntegers integers = new AddIntegers();
        System.out.println(integers.add(7, 13));
    }
}
