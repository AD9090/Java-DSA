package org.example;

public class variables {

    int a=0; // instance variable
    //variables that are defined inside class are called instance variables
    static int b=1; //static variable
    // variable having static datatype are called static variables

    void m1(){
        int c=2,a=3; // a & c are called local variables
        // Local variables are only accesible in that perticular method...

        System.out.println(a+b); // We can use static variable in non static method..
    }

    public static void main(String[] args) {
//        variables v1=new variables();
//        v1.m1();


        //System.out.println(v1.b+20);
    }


}
