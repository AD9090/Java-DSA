package org.example;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // try- catch() nd print exception

        /*
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Any Number : ");
//        int t=sc.nextInt();
//        System.out.println(t);

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(a / b);
        }

        catch(Exception w){

            System.out.println("Using printStackTrace");
            w.printStackTrace();

            System.out.println("Using println(e)");
            System.out.println(w);

            System.out.println("Using println(e.toString())");
            System.out.println(w.toString());

            System.out.println("Using e.getMessage()");
            System.out.println(w.getMessage());
            */

            /*
            try{
                int a=100,b=0;
                int c;
                c=a/b;
                System.out.println("In Try"); // This won't be executed...
            }

            catch(Exception e){
                System.out.println("In catch");
                System.out.println(e);

            }

            finally{
                System.out.println("In Finally");
            }

            System.out.println("Outside all");
            */


        // FINAL keyword

        // Final Variable...

        //final int a=10;
        // a += 10;           -> value of final var. cant be changed.

        //final method...

        //final method doesn't override
        /*
        class A{
            final void show()
            {
                System.out.println("A class - final method");
            }
        }

        class B extends A{

            //void show () {
            //    System.out.println("In AD Method");
            //}
        }
        */

        //final class...

        //final class doesn't inherit

        /*final class A{
            int a=10;
        }

        class B extends A{
            int b=20;
        }*/

        // In Case of multiple catch...

        //In first catch there must be child Exception and after that there must be parent exception   or they may be different
        //Can't do same exception catch block


        //Some Invalid Syntax

        //1.
        /*
        try{

            }
            finally{

            }
            catch{

            }
          */

        //2. Any statments btwn try catch or finally is invalid
        /*
         try{

         }

         System.out.println(); // It is invalid

        catch(){

        }
        System.out.println(); // It is invalid

        finally{

        }
        System.out.println(); // It is invalid
        */




    }
}

