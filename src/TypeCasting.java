public class TypeCasting {

    public static void main(String[] args) {

        // Widening type casting - done by java itself
        int i = 20;
        long l = i;

        // explicit type casting - user defined
        long x = 10000;
        int y = (int) x;

        //  lossy conversion
//        int x = 2000;
//        byte b = (byte) x;

    }
}
