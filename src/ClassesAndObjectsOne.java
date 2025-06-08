
class Car{
    String model = "Hatchback";
    String color = "Black";
    int price = 100000;
    boolean isLocked = false;

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

public class ClassesAndObjectsOne {

    public static void main(String[] args){

        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.getPrice());

        System.out.println(c2.getPrice());

        c2.color = "Gray";
        System.out.println(c2.color);

        c1.drive();
        c2.drive();

        c1.lock();
        c2.unlock();

        System.out.println(c1.isLocked);
        System.out.println(c2.isLocked);

        c2.setPrice(5000);
        System.out.println(c2.getPrice());

    }
}
