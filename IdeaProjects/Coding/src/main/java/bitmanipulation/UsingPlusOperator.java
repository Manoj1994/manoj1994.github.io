package bitmanipulation;

public class UsingPlusOperator {

    public int negate(int num) {
        int sign = (num < 0) ? 1 : -1;
        int neg = 0;
        while(num!=0) {
            neg += sign;
            num += sign;
        }
        return neg;
    }

    public int divide(int dividend, int divisor) {

        int sign = ((dividend > 0)^(divisor > 0)) ? -1 : 1;
        dividend = (dividend < 0) ? negate(dividend) : dividend;
        divisor = (divisor < 0) ? negate(divisor) : divisor;
        int quotient = 0;
        while(dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }
        return sign * quotient;
    }

    public static void main(String[] args) {

        UsingPlusOperator operation = new UsingPlusOperator();
        System.out.println(operation.divide(-20000000, 200003));

    }
}
