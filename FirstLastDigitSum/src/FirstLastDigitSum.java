public class FirstLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(333);
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number%10;
        int firstDigit = number;

        while(firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
}
