package org.example;

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0; i<4; i++)
        {
            System.out.println("user thread");
        }
    }



    // We can overload run() method but JVM always call void argument run() method

    public void run(int a)
    {
        for(int i=0; i<4; i++)
        {
            System.out.println("Run method having 1-Argument is called...");
        }
    }

}

class MyEmptyRun extends Thread
{
    // No Run Method is overrided here...
}

class MyStartMethod extends Thread
{
    public void start()
    {
        System.out.println("My Start Method is executed...");
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<4;i++)
            System.out.println("Thread 1 Method");
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<4;i++)
            System.out.println("Thread 2 Method");
    }
}

class Thread3 extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
            System.out.println("Thread 3 Method");
    }
}
public class multithreading
{
    public static void main(String[] args)
    {
        Thread1 t=new Thread1();
        t.start();
        new Thread3().start();
        Thread3.yield();
        Thread1.yield();
        new Thread2().start();

//        MyEmptyRun r1=new MyEmptyRun();
//        r1.start(); // Thread class run() method will call with empty implementation- not recommended
//
//        System.out.println(Thread.activeCount());
//
//        MyThread t1 = new MyThread();
//        try{
//            t1.sleep(400);
//            System.out.println(t1.getState());
//        }
//        catch(Exception w)
//        {
//            System.out.println(w);
//        }
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());

//        System.out.println(Thread.activeCount());
//        System.out.println(Thread.currentThread());
//
//        MyThread t2= new MyThread();
//        t2.start();

//        MyStartMethod str = new MyStartMethod();
//        str.start();     // Overridden start() method so Thread will not be created

//        new Thread1().start();
//        new Thread2().start();
//        new Thread3().start();
        // System.out.println(Thread.activeCount());

//        System.out.println(t1.getName() + t2.getName()); // returns name of thread
//        System.out.println(t1.getId());  //  returns Identifier (ID) of Thread
//        System.out.println(t2.getId());  // ID of Thread can;t be same...every Thread has its own unique ID
        // When Thread dead , then its ID also release and new Thread may have that same id.

        //t1.getId()=t2.getId();  -> Illegel

//        System.out.println(Thread.currentThread());  // Thread[#1,main,5,main]
//        System.out.println(Thread.activeCount());

        // System.out.println(t2.isAlive());
//        for(int i=0; i<4; i++)
//        {
//            System.out.println("main thread");
//        }
    }
}
