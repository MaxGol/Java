public class PoundsToKg {
    public static void main (String[] args) {
        double pounds;
        double kg;
        if (args.length == 0) {
            pounds = 1d;
        } else {
            pounds = Integer.parseInt(args[0]);
        }
        kg = pounds * 0.45359237d;
        System.out.println(kg);
        long num = 3_231_212_331_231_233_311L;
        System.out.println(num);
    }
}
