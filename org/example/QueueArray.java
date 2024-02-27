package org.example;
//package org.example;
//
//public class QueueArray {
//    static class Queue {
//            static int arr[];
//            static int size;
//            static int rear;
//
//            Queue(int size) {
//                this.size = size;
//                arr = new int[size];
//                rear = -1;
//            }
//
//            public static boolean isEmpty() {
//                return rear == -1;
//            }
//
//            public static boolean isFull() {
//                return rear == size-1;
//            }
//
//            public static void add(int data) {
//                if(isFull()) {
//                    System.out.println("Overflow");
//                    return;
//                }
//
//                arr[++rear] = data;
//            }
//
//            public static int remove() {
//                if(isEmpty()) {
//                    System.out.println("empty queue");
//                    return -1;
//                }
//                int front = arr[0];
//                for(int i=0; i<rear; i++) {
//                    arr[i] = arr[i+1];
//                }
//                rear=rear-1;
//                return front;
//            }
//
//            public static int peek() {
//                if(isEmpty()) {
//                    System.out.println("empty queue");
//                    return -1;
//                }
//
//                return arr[0];
//            }
//
//
//        }
//        public static void main(String args[]) {
//            Queue q = new Queue(5);
//            q.add(10);
//            q.add(20);
//        }
//    }
//

public class QueueArray
{
    /* Member variable declaration */
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    QueueArray(){}
    public QueueArray(int size)
    {
        this.maxSize = size;
        this.queueArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
    public void insert(int item)
    {
        /* Checks whether the queue is full or not */
        if(isQueueFull())
        {
            System.out.println("Queue is full!");
            return;
        }
        if(rear == maxSize - 1)
        {
            rear = -1;
        }
        /* increment rear then insert element to queue */
        queueArray[++rear] = item;
        currentSize++;
    }
    /* Queue:Delete Operation */
    public int delete()
    {
        /* Checks whether the queue is empty or not */
        if(isQueueEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        /* retrieve queue element then increment */
        int temp = queueArray[front++];
        if(front == maxSize)
        {
            front = 0;
        }
        currentSize--;
        return temp;
    }
    /* Queue:Peek Operation */
    public int peek()
    {
        return queueArray[front];
    }
    /* Queue:isFull Operation */
    public boolean isQueueFull()
    {
        return (maxSize == currentSize);
    }
    /* Queue:isEmpty Operation */
    public boolean isQueueEmpty()
    {
        return (currentSize == 0);
    }

    void print(QueueArray q){
        QueueArray q2=new QueueArray();

        while(!q.isQueueEmpty()){
            q2.insert(q.delete());
            System.out.println(q.delete());
        }

    }
    /* Driver Code */
    public static void main(String[] args)
    {
        QueueArray queue = new QueueArray(10);
        queue.insert(2);
        queue.insert(3);
        queue.insert(5);
        queue.print(queue);

    }
}