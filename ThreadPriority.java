public class ThreadPriority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}

class A extends Thread{
    public void run() {
        for (int i = 0; i <20; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello");
        }
    }
}