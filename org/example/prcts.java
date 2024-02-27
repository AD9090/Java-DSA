package org.example;

import java.util.*;
import java.lang.*;


class Student
{
    String nm;
    int id;
    Student()
    {
        nm="noone";
        id=11;
    }
//    Student(String na,int i)
//    {
//        nm=na;
//        id=i;
//    }

    void print(){
        Scanner sc=new Scanner(System.in);
        System.out.println("name : "+nm);

        System.out.println("ID : "+id);

    }

}


    public class prcts{
        public static void main (String[] args){
            String s1 = "CHARUSAT";
            String s2 = " Hello CHARUSAT ";
            System.out.println("Substring:" + s1.substring(5));
            System.out.println("Substring:" + s2.substring(5,8));
            System.out.println(s1.compareTo(s2.trim().substring(6, 14)));
        }    }






















//1.
//public class prcts extends{
//
//
//    String name,id,mail;
//    Scanner sc =new Scanner(System.in);
//    public static void main(String[] args) {
//        prcts p=new prcts();
//        p.info();
//    }
//    void info(){
//
//        A a=new A();
//        B b=new B();
//        C c=new C();
//    }
//
//    void get(){
//        System.out.println("Name : ");
//        name=sc.next();
//        System.out.println("Email : ");
//        mail=sc.next();
//    }
//
//    class A{
//        int fac,stud;
//        A(){
//            fac=10;
//            stud=10;
//            get();
//            calc();
//        }
//        void calc(){
//            System.out.println(fac/stud);
//        }
//
//    }
//    class B{
//        int fac,stud;
//        B(){
//            fac=20;
//            stud=20;
//            get();
//            calc();
//        }
//        void calc(){
//            System.out.println(fac/stud);
//        }
//    }
//    class C{
//        int fac,stud;
//        C(){
//            fac=20;
//            stud=20;
//            get();
//            calc();
//        }
//        void calc(){
//            System.out.println(fac/stud);
//        }
//    }
//}
