package org.example;

public class Queuee {

    private final int MAX;
    private int[] intArray;
    private int front;
    private int rear;
    private int itemCount;

    public Queuee(int size) {
        MAX = size;
        intArray = new int[MAX];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    public void insert(int data) {
        if (!isFull()) {
            if (rear == MAX - 1) {
                rear = -1;
            }

            intArray[++rear] = data;
            itemCount++;
        }
    }

    public int remove() {
        int data = intArray[front++];
        if (front == MAX) {
            front = 0;
        }
        itemCount--;
        return data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<size();i++){
            System.out.println(intArray[i]);
        }
    }

    public int peek() {
        return intArray[front];
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }

    public boolean isFull() {
        return itemCount == MAX;
    }

    public int size() {
        return itemCount;
    }
}
