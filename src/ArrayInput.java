import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int arr[] = new int[input];

        // input
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        // output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
