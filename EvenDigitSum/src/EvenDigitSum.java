public class EvenDigitSum {
    public static void main(String[] args) {
        evenDigitSum(123456789);
    }
    public static int evenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int lastDigit = number%10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }

        System.out.println(sum);
        return sum;
    }
}
