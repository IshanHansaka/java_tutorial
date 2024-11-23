public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increament();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.err.println(c.count);
    }
}

class Count {
    int count;

    public synchronized void increament() {
        count++;
    }
}