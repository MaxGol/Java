public class Main {
    public static void main (String[] args) {

//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        System.out.println(min);
//        System.out.println(max);
//
//        byte minByte = Byte.MIN_VALUE;
//        byte maxByte = Byte.MAX_VALUE;
//        byte newValue = (byte)(maxByte/2);
//        System.out.println(newValue);
//        System.out.println(minByte);
//        System.out.println(maxByte);
//
//        short minShort = Short.MIN_VALUE;
//        short maxShort = Short.MAX_VALUE;
//        System.out.println(minShort);
//        System.out.println(maxShort);
//
//        long minLong = Long.MIN_VALUE;
//        long maxLong = Long.MAX_VALUE;
//        System.out.println(minLong);
//        System.out.println(maxLong);

        byte byteNumber = 63;
        short shortNumber = 654;
        int intNumber = 777;

        long sumNumber = 50000L + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println(sumNumber);
    }

}