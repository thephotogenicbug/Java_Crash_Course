public class ColumnWisePrint {

    public static void main(String[] args){

        int[][] array = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };

        int rows = array.length; // 3
        int cols = array[0].length; // 4

        for(int j = 0; j < cols; j ++){

            for(int i = 0; i < rows; i++){

                System.out.println(array[i][j] + " ");
            }
        }
    }
}
