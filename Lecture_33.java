public class Lecture_33 {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        long result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }
}
