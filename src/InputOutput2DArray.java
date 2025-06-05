import java.util.Scanner;

public class InputOutput2DArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];

        // input of 2d array
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // print the output
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
