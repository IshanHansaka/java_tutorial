public class InnerClass {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();
        obj2.show();
    }
}

class A {
    int a = 10;

    public void show() {
        System.out.println("In A");
    }

    class B {
        public void show() {
            System.out.println("In B");
        }
    }
}
