package dsapracticals;

public class StackkStatic {
    int a[];
    int capacity;
    int top=-1;

    boolean isEmpty(){
        return top==-1;
    }
    StackkStatic(){}

    StackkStatic(int size){
        a=new int[size];
        capacity=a.length;
    }
    boolean isFull(){
        return top==capacity-1 ;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }

        a[top++]=data;
        return;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int temp=a[top];
        top--;
        return temp;
    }

    int peek(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }

        return a[top];
    }

    void print(){
        for(int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackkStatic s=new StackkStatic();
        s.push(10);
        s.push(20);
        s.push(30);
        s.print();
        System.out.println("pop() pop()");
        s.pop();
        s.pop();
        s.print();
    }

}
