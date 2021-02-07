public class NumberPalindrome {
    public static void main (String[] args) {
        System.out.println("done");
        isPolindrome(123421);
    }
    public static Boolean isPolindrome(int number) {
        int temp, sum = 0, reminder;
        if ( number < 0) {
            number *= -1;
        }
        temp = number;
        while(number > 0) {
            reminder = number%10;
            sum = (sum*10) + reminder;
            number /= 10;
        }
        System.out.println(sum);
        System.out.println(temp == sum);
        return temp == sum;
    }
}

