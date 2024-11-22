public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}

class A {
    public void show() {
        System.out.println("In show");
    }
}