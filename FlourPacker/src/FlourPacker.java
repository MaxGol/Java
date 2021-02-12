public class FlourPacker {
    public static void main (String[] args) {
        canPack(1,0,4);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }
}
