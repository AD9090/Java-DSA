package org.example;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node() {

    }
}
public class LinkedList {

    public static void main(String[] args) {
        Node node1= new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next=node2;
        node2.next=node3;
        System.out.println(node1.data);
        System.out.println(node2.next);
        System.out.println(node3.next);
        System.out.println(node1.next.next);

    }
}
