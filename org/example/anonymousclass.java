package org.example;

interface I1{
    void math1();
    void math2();
}

//class jaggu implements I1{
//
//    @Override
//    public void math1() {
//        System.out.println("jaggu math1");
//    }
//
//    @Override
//    public void math2() {
//        System.out.println("jaggu math2");
//    }
//}

public class anonymousclass {
    public static void main(String[] args) {
//        jaggu j=new jaggu();
//        j.math1();
        I1 ob1 = new I1() {
            @Override
            public void math1() {
                System.out.println("I am math1");
            }

            @Override
            public void math2() {
                System.out.println("I am math2");
            }
        };

        ob1.math1();
        ob1.math2();
    }
}
