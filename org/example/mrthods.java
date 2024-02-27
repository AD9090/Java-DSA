package org.example;

class AD{
    static void A(){
        System.out.println("A called");
    }

}
public class mrthods {

    void any()
    {
        System.out.println("Any");
    }


    static void print(){
        System.out.println("Print() method directly called because it is inside same class...");
        // any(); - cant call beacuse its non static method
    }
    public static void main(String[] args) {
        print(); // for call any method it must be static
        // In static method you can only call other statics method...

        //If you want to call any non static method in static method ,
        // then you have to creat object of that class nd using that you can call that non static method in static function...
        mrthods m=new mrthods();
        m.any();

        AD o=new AD();
        o.A();

        AD.A();  // You can use static method in other class with class name.method name
    }


}
