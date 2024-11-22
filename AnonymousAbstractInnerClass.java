public class AnonymousAbstractInnerClass {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                System.out.println("In new how");
            }
        };

        obj.show();
    }
}

abstract class A {
    public abstract void show();
}