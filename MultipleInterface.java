// class --> class = extends
// class --> interface = implements
// interface --> interface = extends

public class MultipleInterface {
    public static void main(String[] args) {
        A obj1 = new D();
        obj1.show1();

        B obj2 = new D();
        obj2.show1();
        obj2.show2();

        C obj3 = new D();
        obj3.show3();

        D obj4 = new D();
        obj4.show1();
        obj4.show2();
        obj4.show3();
    }
}

interface A {
    public void show1();
}

interface B extends A {
    public void show2();
}

interface C {
    public void show3();
}

class D implements B,C {
    public void show1() {
        System.out.println("In show1");
    }

    public void show2() {
        System.out.println("In show2");
    }

    public void show3() {
        System.out.println("In show3");
    }
}