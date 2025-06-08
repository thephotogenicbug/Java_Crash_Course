
class CarClass{
    String model ;
    String color ;
    int price ;
    boolean isLocked = false;


    CarClass(){
        System.out.println("Default constructor");
        model =  "Hatchback";
        color =  "Black";
        price = 100000;

    }

    // constructor
    CarClass(String modelName, String colorName, int priceValue){
        System.out.println("Parameterized constructor");
       model = modelName;
       color = colorName;
       setPrice(priceValue);
    }

    void drive(){
        System.out.println("Drive");
    }

    void lock(){
        isLocked = true;
        System.out.println("Car is now locked");
    }

    void unlock(){
        isLocked = false;
        System.out.println("Car is now unlocked");
    }

    // Getter for price property
    int getPrice(){
        return price;
    }

    // setter for price property
    void setPrice(int priceValue){
        price = priceValue;
    }
}


public class ConstructorMethod {

    public static void main(String[] args){

        CarClass c1 = new CarClass("Hatchback", "Red",6000);
        CarClass c2 = new CarClass();

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);




    }
}
