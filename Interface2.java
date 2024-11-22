public class Interface2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev1 = new Developer();
        dev1.work(lap);

        Developer dev2 = new Developer();
        dev2.work(desk);
    }
}

interface Computer {
    public void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, run, faster");
    }
}

class Developer {
    public void work (Computer comp) {
        comp.code();
    }
}