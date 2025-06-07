public class AutoBoxing {

    public static void main(String[] args){

        int x = 5;
        float y = 3.14F;
        long z = 6000;

        // Autoboxing
        Integer intObj = x;
        Float floatObj = y;
        Long longObj = z;

        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(longObj);


    }
}
