public class GreatestCommonDivisor {
    public static void main (String[] args) {
        getGreatestCommonDivisor(15, 20);
        getGreatestCommonDivisorForLoop(200, 1234);
    }
    public static int getGreatestCommonDivisor (int a, int b) {
        int num1 = a;
        int num2 = b;
        if (a < 10 || b < 10) {
            return -1;
        } else {
            while (a != b) {
                if(a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.printf("GCD of %d and %d is: %d", num1, num2, b);
        return b;
    }

    public static int getGreatestCommonDivisorForLoop (int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }

        System.out.printf("GCD of %d and %d is: %d", a, b, gcd);
        return gcd;
    }
}
