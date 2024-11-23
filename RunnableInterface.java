public class RunnableInterface {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        // Runnable functional interface with lambda expression
        Runnable obj3 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {e.printStackTrace();}
            }
        };
        Runnable obj4 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) { e.printStackTrace();}
            }
        };

        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t3.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.start();
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("X");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Y");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}