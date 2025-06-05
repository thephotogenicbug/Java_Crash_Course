public class FunctionReturnTypes {

   static int square(int num){
        return num * num;
    }

   static void hello(){
        System.out.println("Hello world");

    }

    static String[] heroes(){
       String[] superheroes = {"Iron man", "Spiderman", "Captain America"};
       return superheroes;
    }
    public static void main(String[] args){

        System.out.println(square(10));
        System.out.println(square(7));

        hello();

        String[] arr = heroes();
        for(String heros : arr){
            System.out.println(heros);
        }

    }
}
