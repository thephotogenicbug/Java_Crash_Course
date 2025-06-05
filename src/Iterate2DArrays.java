public class Iterate2DArrays {

    public static void main(String[] args){

        int[][] a = {
                {2,5,1,7},
                {8,-2,0,5},
                {-9,-1,3,2}
        };

//        int []b = {2,6,1,8,9};
//
//        for(int i = 0; i < b.length; i++){
//            System.out.println(b[i]);
//        }

        for(int i = 0; i < a.length; i++){
//            System.out.println(a[i]);

//            Array - a[i]
            for(int j = 0; j < a[i].length; j++){
            System.out.println(a[i][j] + " ");
        }
            System.out.println();
        }
    }
}
