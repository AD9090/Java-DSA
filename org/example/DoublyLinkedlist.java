package org.example;

public class DoublyLinkedlist {
    Node head;
    Node tail;
    public class Node {
        int data;
        Node prev;
        Node next;

        Node() {}

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

        void addfirst(int dt){
            Node newNode = new Node(dt);

            if(head==null){
                head=newNode;
                tail=newNode;
                newNode.prev=null;
                newNode.next=null;
                return;
            }

            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }

        void addlast(int dt){
            Node newNode = new Node(dt);

            if(head==null){
                head=newNode;
                newNode.prev=null;
                newNode.next=null;
                return;
            }

            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }

            currNode.next=newNode;
            newNode.prev=currNode;

        }

        void deletefirst(){

            if(head==null){
                return;
            }

            if(head.next==null){
                head=null;
                return;
            }

            head=head.next;
            head.prev=null;
        }

        void deletelast(){

            if(head==null){
                return;
            }

            if(head.next==null){
                head=null;
                return;
            }

            Node currNode=head;
            while(currNode.next.next!=null){
                currNode=currNode.next;
            }

            currNode.next.prev=null;
            currNode.next=null;
        }

        void print(){
            Node currNode =head;
            while(currNode!=null) {
                System.out.println(currNode.data);
                currNode=currNode.next;
            }
        }

        public static void main(String[] args) {
            DoublyLinkedlist o = new DoublyLinkedlist();
            o.addfirst(10);
            o.addfirst(30);
            o.addlast(5);
            //o.deletelast();
            o.deletefirst();
            o.print();
        }
}
