public class OverLoading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(1, 1));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1.2,8));
    }
}

class Calculator {
    public int add (int a, int b) {
        return a + b;
    }
    public int add (int a, int b, int c) {
        return a + b + c;
    }
    public double add (double a, int b) {
        return a + b;
    }
}