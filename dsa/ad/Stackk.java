package dsa.ad;
import java.util.*;

//
//public class Stackk {
//    static class Node{
//        int data;
//        Node next;
//
//        Node(int data){
//            this.data=data;
//        }
//    }
//
//    static class stackk{
//        static Node front;
//
//        public static boolean isEmpty(){
//            return front==null;
//        }
//
//        public static void push(int data){
//            Node newNode = new Node(data);
//            if(isEmpty()){
//                front=newNode;
//                return;
//            }
//
//            newNode.next=front;
//            front=newNode;
//        }
//
//        public static int pop(){
//            if(isEmpty()){
//                System.out.println("Empty... Can't pop");
//                return -1;
//            }
//
//            if(front.next==null){
//                int t=front.data;
//                front=null;
//                return t;
//            }
//            int temp= front.data;
//            front=front.next;
//            return temp;
//        }
//
//        public static int peek(){
//            if(front==null){
//                System.out.println("Empty...");
//                return -1;
//            }
//            return front.data;
//        }
//
//    }
//
//    static void printStak(stackk s){
//        while(s.front!=null){
//            System.out.print(s.front.data+" ");
//            s.front=s.front.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        stackk s=new stackk();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(9);
//        printStak(s);
//        s.peek();
//        s.pop();
//        s.pop();
//        s.peek();
//        printStak(s);
//    }
//
//}
class Stackk {
    public static void main(String[] args) {
        int [] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};
        // First Sort Activity based on end time

        int [][] a = new int[start.length][3];
        // 3 colums :-
        // column 1 for index
        // column 2 for start time
        // column 3 for end time

        for(int i=0;i<end.length;i++){
            a[i][0]=i;
            a[i][1]=start[i];
            a[i][2]=end[i];
        }

        // Sorting activity based on end time
        Arrays.sort(a,Comparator.comparingDouble(o->o[2]));

        // Selecting Activities

        ArrayList <Integer> al=new ArrayList<>();
        // for include selected activities in arraylist

        int maxAct=1;
        //After Sorting first activity (ending first) is always included
        al.add(a[0][0]);

        int lastEnd=a[0][2];

        // Checking start time of curr Activity is greater than end time of previosly selected activity , than select that activity
        for(int i=1;i<end.length;i++){
            if(a[i][1]>=lastEnd){
                maxAct++;
                al.add(i);
                lastEnd=a[i][2];
            }
        }

        System.out.println("Selected Activities  ");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

    }
}