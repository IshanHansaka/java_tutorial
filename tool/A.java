package tool;

public class A {
    private int a = 10; // private acces modifier allows to access only inside the class
    protected int b = 20;
    int c = 30;

    // public access modifier allows to access inside and outside class or packge 
    public int getA() { 
        return a;
    }
}

class C extends A {
    public void show() {
        System.out.println(b);
    }
}
