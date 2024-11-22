public class OverRidding {
    public static void main(String[] args) {
        B b = new B();
        int result = b.show(5, 4);
        System.out.println(result);
    }
}

class A {
    public int show(int a, int b) {
        return a+b;
    }

    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}

class B extends A {
    public int show(int a, int b) {
        return a+b+1;
    }

    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}