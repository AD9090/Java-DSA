package dsapracticals;

public class Stackk {
    Node top;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    void push(int x){ // addFirst method

        Node newNode= new Node(x);

        if(top==null){
            top=newNode;
            return;
        }

        newNode.next=top;
        top=newNode;
        return;
    }

    int pop(){
        if(top==null){
            System.out.println("Underflow");
            return -1;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        return temp.data;
    }

    int peek(){
        if(top==null){
            System.out.println("Underflow");
            return -1;
        }
        return top.data;
    }

    void print(){
        Node tempp=top;
        while(tempp!=null){
            System.out.print(tempp.data+" ");
            tempp=tempp.next;
        }
    }


    public static void main(String[] args) {
        Stackk s=new Stackk();
        s.push(10);
        s.push(20);
        s.print();
        s.pop();
        System.out.println();
        s.print();

        s.push(30);
        s.pop();
        s.pop();
        s.print();
    }



}
