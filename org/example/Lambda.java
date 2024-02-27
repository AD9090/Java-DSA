package org.example;

interface FunctionalIntr
{
    // An Interface having only one function is called Functional Interface...
    void onefunc(int x,int y);
    // void onefunc(int a); // - Can't Define because it is Functional Interface
}

//class Demo implements FunctionalIntr
//{
//    @Override
//    public void onefunc() {
//        System.out.println("I am Function 1 of Demo Class...");
//    }
//}
public class Lambda
{
    public static void main(String[] args) {
//        FunctionalIntr ob= new Demo();
//        ob.onefunc();

//        FunctionalIntr f = new FunctionalIntr() {
//            @Override
//            public void onefunc() {
//                System.out.println("Anonyms inner clas....");
//            }
//        };
//        f.onefunc();

        //Creating one Referense of Functional interface
//        FunctionalIntr ob = (a)->{
//            System.out.println("I am Function 1 from Functional Interface of lambda...");
//        };
//        ob.onefunc(10);

        //Creating another Referense of Functional interface

        FunctionalIntr ob1 = (x,y)->{
            System.out.println("I am Function 1111111 from Functional Interface of lambda...");
            System.out.println(x);
        };
        int a=100;
        ob1.onefunc(a,200);
    }
}
