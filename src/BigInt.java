import java.math.BigInteger;

public class BigInt {

    public static void main(String[] args){

        // BigInteger
//      long x = (long)Math.pow(10,20);
//      System.out.println(x);

//        BigInteger a = new BigInteger("50000000000");
//        BigInteger b = new BigInteger("10000000000");
//        System.out.println(a);
//        System.out.println(b);
//
//        BigInteger c = a.add(b);
//        BigInteger d = a.subtract(b);
//
//        System.out.println(c);
//        System.out.println(d);
//
//        BigInteger x = new BigInteger("123456789");
//        BigInteger y = new BigInteger("2");
//        System.out.println(x.multiply(y));
//        System.out.println(x.divide(y));
//
//        BigInteger z = x.pow(20);
//        System.out.println(z);
//
//        System.out.println(x.mod(y));

        // data conversion
//        long x = 50;
//        BigInteger b = new BigInteger(x + ""); // typecast
//
//        System.out.println(b);
//
//        BigInteger b2 = new BigInteger("5353643747586");
//        int y = b2.intValue();
//        System.out.println(y);
//
//        long z = b2.longValue();
//        System.out.println(z);

        // Compute Factorial
         int x = 6;
//         int ans = 1;
         BigInteger ans = new BigInteger("1");

         for(int i = 1; i <= x; i ++){
//             ans = ans * i;
             BigInteger temp = new BigInteger(i + "");
             ans = ans.multiply(temp);
         }

        System.out.println(ans);


    }
}
