//final - variables, methods, class

public class Final {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.getArea();
    }
}

class A {
    private final double PIE = 3.14; // final keyword converts variable to a consant

    //final method can't override by other method from childclass
    public final void show() {
        System.out.println("by John");
    }

    public double getPIE() {
        return PIE;
    }
}

// final class can't inherited from other classes
final class B extends A {
    double r = 7;
    double area = getPIE()*(int)Math.pow(r, 2);
    public void getArea() {
        System.out.println("area = "+area);
    }
}