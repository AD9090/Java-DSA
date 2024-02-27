package org.example;

public class StackClass {
    static class Node {
        int data;
        Node next;

        Node() {}

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        public static void pushAtBottom(int data){
            Node newNode=new Node();
            if(isEmpty()){
                push(data);
                return;
            }
            int top=pop();
            pushAtBottom(data);
            push(top);
        }

    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pushAtBottom(2);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}


//import java.util.*;
//public class StackClass {
//    static class Node {
//        int data;
//        Node next;
//
//        Node() {}
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    static class Stack {
//        public static Node head;
//
//        public static boolean isEmpty() {
//            return head == null;
//        }
//
//        public static void push(int data) {
//            Node newNode = new Node(data);
//            if (isEmpty()){
//                head=newNode;
//                return;
//            }
//            newNode.next=head;
//            head=newNode;
//        }
//
//        public static int pop(){
//            if(isEmpty()){
//                //System.out.println("underflow");
//                return -1;
//            }
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//
//        public static int peek(){
//            if(isEmpty()){
//                //System.out.println("underflow");
//                return -1;
//            }
//            return head.data;
//        }
//
//        public static void pushAtBottom(int data){
//            Node newNode=new Node();
//            if(isEmpty()){
//                push(data);
//                return;
//            }
//            int top=pop();
//            pushAtBottom(data);
//            push(top);
//        }
//
//        public static void PrintStack(Stack s)
//        {
//            if (s.isEmpty()) {
//                return;
//            }
//
//            int x = s.peek();
//
//            s.pop();
//
//            System.out.print(x + " ");
//            PrintStack(s);
//            s.push(x);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Stack s1=new Stack();
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//
//        while(choice!=0){
//
//            if(choice==1){
//                s1.push(sc.nextInt());
//            }
//
//            else if(choice==2){
//                s1.pop();
//            }
//
//            else if(choice==3){
//                s1.PrintStack(s1);
//            }
//
//            choice=sc.nextInt();
//        }
//    }
//}