package org.example;
import java.io.*;
import java.util.*;

public class QueueB {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    static class Queue {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null && tail == null;
        }


        public static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                tail = head = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }


        public static int remove() {
            if(isEmpty()) {
                System.out.println("underflow");
                return -1;
            }
            int data = head.data;

            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return data;
        }


        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }

    }
    public static void PrintQueue(Queue s)
    {
        if (s.isEmpty()) {
            return;
        }
        Node thead=s.head;
        while(thead!=s.tail){
            System.out.print(thead.data + " ");
            thead=thead.next;
        }
        System.out.println(s.tail.data);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Queue q = new Queue();
        int choice = sc.nextInt();

        while (choice != 0) {

            if (choice == 1) {
                q.add(sc.nextInt());
            }
            else if (choice == 2) {
                q.remove();
            } else if (choice == 3) {
                PrintQueue(q);
                System.out.println();
            }

            choice = sc.nextInt();
        }

    }
}