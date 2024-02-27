package org.example;


public class SortLL{

    static class Linkedlist{
        Node head;

        public class Node{
            Node next;
            int data;
            Node(){}
            Node(int data){
                this.data=data;
            }
        }

        void add(int n){
            Node newNode= new Node(n);
            if(head==null){
                head=newNode;
                return;
            }
            if(head.next==null){
                head.next=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }

        void insertInSortedOrder(int n){
            Node newNode=new Node(n);
            if(head==null){
                head=newNode;
                return;
            }
            if(head.next==null){
                if(newNode.data<head.data){
                    newNode.next=head;
                    head=newNode;
                }
                else{
                    head.next=newNode;
                }
                return;
            }
            if(newNode.data<head.data){
                newNode.next=head;
                head=newNode;
                return;
            }
            Node prev=head;
            Node curr=head.next;
            while(curr!=null && newNode.data<curr.data){
                curr=curr.next;
                prev=prev.next;
            }
            prev.next=newNode;
            newNode.next=curr;
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        void print() {

            Node currNode = head;
            while (currNode != null) {
                System.out.println(currNode.data);
                currNode=currNode.next;
            }
        }

        public static void main(String[] args) {
            Linkedlist l=new Linkedlist();
            l.insertInSortedOrder(1);
            l.insertInSortedOrder(4);
            l.insertInSortedOrder(2);
            l.insertInSortedOrder(-1);
            l.insertInSortedOrder(11);
            l.print();
        }
    }



}
