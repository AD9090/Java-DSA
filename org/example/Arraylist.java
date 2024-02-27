package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {
    public static void main(String[] args) {

        int a=5;
        //ArrayList <Integer> a1=new ArrayList();
        LinkedList <Integer> a1=new LinkedList();
        a1.add(100);
        a1.add(20);
        a1.add(5);
        a1.add(1);
        a1.add(0);

        if(a1.indexOf(5)==2){
            System.out.println("YEYYYYY");
        }

    }
}