import java.util.Scanner;

public class LinearSearchAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] array = new int[input];

        // input loop
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // enter the key
        int key = sc.nextInt();

        int ans = -1;

        // iterate over the array and update ans if key is found
//        for (int i = 0; i < input; i++) {
//
//            if (array[i] == key) {
//                ans = i;
//                break;
//            }
//        }

        // Iterates right to left and returns the last occurence
        for (int i = input - 1; i >= 0; i--) {
            if (array[i] == key) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
