public class Interface {
    public static void main(String[] args) {
        A obj = new B();

        obj.show1();
        obj.show2();

        System.out.println(A.num1);
        System.out.println(A.num2);
    }
}

interface A {
    final static int num1 = 20; // all variables are "final static"
    int num2 = 10; // this also converts to final static

    abstract public void show1(); //all methods are "abstract final"  
    public void show2(); // this also converts to public abstract
}

class B implements A {
    public void show1() {
        System.out.println("In show1");
    }

    public void show2() {
        System.out.println("In show2");
    }
}