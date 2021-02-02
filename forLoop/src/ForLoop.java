public class ForLoop {
    public static void main (String[] args) {
        int primeCount = 0;
        for (int i = 0; i <= 3; i++) {
            if (primeCount == 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
        }


        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    }
    private static boolean isPrime (int num) {
       if (num <= 1) {
           return false;
       }
       for (int i = 2; i <= num/2; i++) {
           if(num % i == 0) {
               return false;
           }
       }
       return true;
    }
}
