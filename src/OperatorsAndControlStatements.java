import java.util.Scanner;

public class OperatorsAndControlStatements {

    public static void main(String[] args) {
        // arithmetic operators
//        int a = 10;
//        int b = 3;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a / (float) b);
//        System.out.println(a % b);
//        System.out.println(23 % 5);

        // relational operators
//        System.out.println(a == b); // false
//        System.out.println(a != b); // true
//        System.out.println(a > b); // true
//        System.out.println(a < b); // false
//        System.out.println(a >= b); // true
//        System.out.println(a <= b); // false

        // ternary operator
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        String ans = num % 2 == 0 ? "Even" : "Odd";
//        System.out.println(ans);

        // logical operators
        int age = 25;
        String citizenship = "Indian";

        // logical AND - &
        if (age >= 18 & citizenship == "Indian") {

            System.out.println("Person may vote");

        } else {

            System.out.println("Person cannot vote");
        }

        // logical short circuit AND - &&
        if (age >= 18 && citizenship == "Indian") {

            System.out.println("Person may vote");

        } else {

            System.out.println("Person cannot vote");
        }

        // logical OR - |
        String organisation = "Scaler";

        if (organisation == "Scaler" | organisation == "Interviewbit") {

            System.out.println("User is permitted");
        } else {

            System.out.println("User blocked");
        }

        // logical short circuit OR - ||
        if (organisation == "Scaler" || organisation == "Interviewbit") {

            System.out.println("User is permitted");
        } else {

            System.out.println("User blocked");
        }

        // logical NOT - !
        boolean flag = false;

        if (!flag) {
            System.out.println("Hello world");
        }

    }
}
