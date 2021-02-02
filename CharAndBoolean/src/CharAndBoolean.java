public class CharAndBoolean {
    public static void main (String[] args) {
        char letter = '\u00a9';
        System.out.println(letter);

        int tr = 1;
        int fl = 0;

        boolean bool1 = true;
        boolean bool2 = false;

        boolean bool3 = (tr > 0);
        boolean bool4 = (fl > 0);

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);
    }
}
