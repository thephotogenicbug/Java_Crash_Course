
class ComplexNumber{
    int real;
    int imaginary;


    // constructor
    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = real;
    }

//    void print(){
////        System.out.println("this = " + this);
//        System.out.println(this.real + " + " + this.imaginary + "i" );
//    }

    ComplexNumber add(ComplexNumber y){
        int sumReal = this.real + y.real;
        int sumImag = this.imaginary + y.imaginary;
        ComplexNumber res = new ComplexNumber(sumReal, sumImag);
        return res;
    }

    public String toString(){
        return this.real + " + " + this.imaginary + "i" ;
    }
}


public class ThisKeyword {

    public static void main(String[] args){
      ComplexNumber x = new ComplexNumber(2,3);
//        x.print();
//        System.out.println("x = " + x);

        ComplexNumber y = new ComplexNumber(-5, 4);
//        y.print();

        ComplexNumber z = x.add(y);
//        z.print();

        // toString method
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
