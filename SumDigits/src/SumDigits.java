public class SumDigits {
    public static void main (String[] args) {
        sumDigits(333);
    }
    public static int sumDigits (int number) {
        if (number < 10) {
            System.out.println("negative number");
            return -1;
        } else {
            int sum = 0;
            while (number > 0) {
                int digit = number%10;
                sum += digit;
                number /= 10;
            }
            System.out.println(sum);
            return sum;
        }
    }
}
