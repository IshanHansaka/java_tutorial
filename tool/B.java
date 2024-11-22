package tool;

public class B {
    A a = new A();
    public void display () {
        System.out.println(a.c); // default access modifier allows to access c variable because same package
    }
}
