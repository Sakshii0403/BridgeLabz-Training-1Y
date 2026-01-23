class HelloWorld {
    static int emailId;
}

public class Demo {

    static int staticX = 50;   // static variable
    int instanceX = 60;        // instance variable

    public static void m2() {
        int y = 30;
        System.out.println("m2 local var: " + y);
    }

    public static void m1() {
        int y = 20;
        System.out.println("m1 local var: " + y);
        m2();
    }

    public static void main(String[] args) {

        int y = 10;
        System.out.println("Hello World");
        System.out.println("main local var y: " + y);

        m1();

        Demo obj = new Demo();
        System.out.println("instance / non-static variable: " + obj.instanceX);
        System.out.println("static variable: " + staticX);
    }
}