class A {
    public A() {
        System.out.println("In A");
    }

    public A(int a) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        this(5);
        System.out.println("In B");
    }

    public B(int a) {
        System.out.println("In B int");
    }
}

public class Supper {
    public static void main(String[] args) {
        B b = new B();
    }
}
