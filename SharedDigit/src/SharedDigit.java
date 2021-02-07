public class SharedDigit {
    public static void main (String[] args) {
        hasSharedDigit(19, 39);
    }
    public static boolean hasSharedDigit(int a, int b) {
        boolean answer;
        if ((a >= 10 && a <= 99 && b >= 10 && b <= 99)) {
            answer = (a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10);
            System.out.println(answer);
            return answer;
        }
        return false;
    }
}
