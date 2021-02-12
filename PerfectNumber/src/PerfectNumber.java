public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(33550336);
    }

    public static boolean isPerfectNumber (int n) {
        if (n < 0) return false;
        int sum = 0;
        int i = 1;
        while(i <= n/2) {
            if(n % i == 0) {
                sum += i;
            }
            i++;
        }
        return (sum == n);
    }
}
