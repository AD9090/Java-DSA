package org.example;

interface intrfc
{
    int a=100;
    static int b=0;
    void get();
    //static tanti(); - cant have static method inside interface..
    //public void ad(); - on;y can have public method inside interface, no private,final , static, protected inside it
}

class child implements intrfc
{
    int a=10;
    public void get(){
        System.out.println("child11");
    }
    
    static{
        System.out.println("child static");
    }
    {
        System.out.println("child instms");
    }
    child(){
        System.out.println("child cnstr");
    }
}

class child2 extends child{
    public void get(){
        System.out.println("child2..");
    }

    public void A(){
        System.out.println("A");
    }
    static{
        System.out.println("child static 2");
    }
    {
        System.out.println("child instms 2");
    }
    child2(){
        System.out.println("child cnstr 2");
    }
}

class child3 extends child2 {
    public void get() {
        System.out.println("child3..");
    }
}


    class abstractt {
        public static void main(String[] args) {
            //System.out.println(intrfc.b);

//            child2 c = new child3();
//            c.get();
//            c.A();

            child2 child2 = new child2();
            child2 ch=new child2();
            
        }
    }

