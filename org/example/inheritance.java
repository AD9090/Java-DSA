package org.example;
import java.util.*;
import java.lang.Object;
class A
{
    void a(){
        System.out.println("a of class A called");
    }
    A(){
        System.out.println("A ccc");
    }
}

class B extends A
{
    void a(){
        System.out.println("a of class B called");
    }
    B() {
        System.out.println("b bbb");
    }

}

class C extends B
{
    void c()
    {
        System.out.println("c of class C called");
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        C obc=new C();
        A oba=new A();
        obc.c(); // c() of class C called
        obc.a(); // a() of class B called

        oba.a(); // a() of class A called
    }
}
