public class Throws {
    public static void main(String[] args) {
        A obj = new A();
        
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class A {
    // throws execption to the one called this show() method
    public void show() throws ClassNotFoundException {
        Class.forName("B");
    }
}