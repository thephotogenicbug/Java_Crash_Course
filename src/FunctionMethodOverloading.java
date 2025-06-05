public class FunctionMethodOverloading {

    static int add(int a, int b){
        System.out.println("Inside first add");
        return a+b;
    }

    static String add(String a, String b){
        System.out.println("Inside second add");
        return a + b;
    }

    static String add(int a, String b){
        System.out.println("Inside third add");
        return a + b;
    }
    public static void main(String[] args){
        System.out.println(add(4,5));
        System.out.println(add("Hello ", "World"));
        System.out.println(add(5, " Apples"));

    }
}
