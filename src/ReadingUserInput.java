
import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        byte b = sc.nextByte();
//        long l = sc.nextLong();
//        short s = sc.nextShort();
//        String string = sc.next();
//        String string = sc.nextLine();

//          boolean bool = sc.nextBoolean();
//          System.out.println(bool);

        char c = sc.next().charAt(0); // read single character
        System.out.println(c);
    }
}
