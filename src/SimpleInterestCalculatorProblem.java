
import java.util.Scanner;

public class SimpleInterestCalculatorProblem {

    public static void main(String[] args) {

//        SI = P=100 X R=5 X T=2 * 100 // formula

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
