package org.example;

public class LinkedListt {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    void addFirst(int data)
    {
       Node newNode= new Node(data);
       if(head==null)
       {
           head=newNode;
           return;
       }
           newNode.next=head;
           head=newNode;
    }

    void addLast(int data)
    {
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode= head;

        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }
    void print() {

        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }

    void deleteFirst(){

        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }

        head=head.next;
    }

    void deleteLast(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }

        if(head.next==null)
        {
            head=null;
            return;
        }

//        Node prevNode=head;
//        Node LastNode=head.next;
//        while(LastNode.next !=null)
//        {
//            LastNode=LastNode.next;
//            prevNode=prevNode.next;
//        }
//
//        prevNode.next=null;


        Node prevNode=head;
        while(prevNode.next.next!=null){
            prevNode=prevNode.next;
        }
        prevNode.next=null;

    }

    void deleteFromSepcificIndex(int index)
    {

        if(head==null)
        {
            System.out.println("List is empty...");
            return;
        }

        if(head.next==null && index==0)
        {
            head=null;
            return;
        }

        int cnt=0;
        Node prevNode=head;
        while(cnt<index-1)
        {
            prevNode=prevNode.next;
            cnt++;
        }

        prevNode.next=prevNode.next.next;
    }

    void addAtSpecificPosition(int data,int index){
        Node newNode= new Node(data);

        if(index==0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }

        if(head==null)
        {
            head=newNode;
            return;
        }

        if(head.next==null)
        {
            newNode.next=head;
            head=newNode;
            return;
        }

        Node prevNode= head;
        Node currNode= head.next;
        int cnt=1;
        while(cnt<=index-1){
            cnt++;
            prevNode=prevNode.next;
            currNode=currNode.next;
        }
        prevNode.next=newNode;
        newNode.next=currNode;
    }

    void inserInSortedOrder(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        if(head.next==null){
            if(head.data < newNode.data){
                head.next=newNode;
                return;
            }
            else{
                newNode.next=head;
                head=newNode;
                return;
            }
        }

        if(head.data>newNode.data){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null && currNode.data < newNode.data){
            prevNode=prevNode.next;
            currNode=currNode.next;
        }
        prevNode.next=newNode;
        newNode.next=currNode;

    }

    int getElementFromList(int index){
        Node curr=head;
        int c=1;
        while(index>=c){
            c++;
            curr=curr.next;
        }
        return curr.data;
    }

    void printReverse(Node head){
        if(head==null){
            return;
        }
        else{
            printReverse(head.next);
            System.out.println(head.data);
        }
        return;
    }

    void check(){
        Node n1=head;
        //n1.next.next=n1.next;
        Node n2=head.next;
        n2=null;
//        while(n1!=null){
//            System.out.print(n1.data+"-> ");
//            n1=n1.next;
//        }
        System.out.println(n1.data+"-> "+ n2);
    }
    public static void main(String[] args) {

        String s1="AD";
        s1=s1.concat("heheee");
        System.out.println(s1);


        LinkedListt o1=new LinkedListt();
        o1.addFirst(40);
        o1.addLast(50);
        o1.addLast(60);
        o1.addAtSpecificPosition(45,1);
        o1.addAtSpecificPosition(30,0);
        //o1.print();
        //System.out.println('\n');
//        o1.inserInSortedOrder(20);
//        o1.inserInSortedOrder(42);
//        o1.inserInSortedOrder(50);
        o1.deleteLast();
        o1.deleteFromSepcificIndex(2);

//        o1.inserInSortedOrder(-1);
//        o1.inserInSortedOrder(5);
//        o1.inserInSortedOrder(3);
//        o1.inserInSortedOrder(4);
//        o1.inserInSortedOrder(0);
//        o1.inserInSortedOrder(2);

//        o1.inserInSortedOrder(4);
//        o1.inserInSortedOrder(2);
//        o1.inserInSortedOrder(1);
//        o1.inserInSortedOrder(3);
        o1.print();
        //System.out.println();
        o1.printReverse(o1.head);
        //System.out.println(o1.getElementFromList(3));
        LinkedListt o2=new LinkedListt();
        o2.addFirst(1);
        o2.addLast(2);
        o2.check();
    }
}

