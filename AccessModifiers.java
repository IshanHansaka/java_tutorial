import tool.A;
import tool.B;

public class AccessModifiers {
    public static void main(String[] args) {
        C c = new C();
        c.show();

        B b = new B();
        b.display();
    }
}

class C extends A {
    public void show() {
        System.out.println(b); //protected access modifier allows to access variable in subclass inside or outside the package
    }
}
