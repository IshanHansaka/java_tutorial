public class AnonymousObject{
    public static void main(String[] args) {
        new Sample(99).show(); //anonymous object
    }
}

class Sample {
    int num;

    public Sample(int num) {
        this.num = num;
    }

    public void show() {
        System.out.println(num);
    }
}