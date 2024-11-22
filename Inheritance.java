public class Inheritance {
    public static void main(String[] args) {
        AdvCalc cal1 = new AdvCalc();
        int n1 = cal1.add(5, 9);
        int n2 = cal1.sub(8, 3);
        int n3 = cal1.mul(5, 3);
        int n4 = cal1.div(12, 4);

        System.out.println(n1 +" "+ n2 +" "+ n3 +" "+ n4);
    }
}

class Calc {
    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int sub(int n1, int n2) {
        return n1-n2;
    }
}

class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1*n2;
    }
    
    public int div(int n1, int n2) {
        return n1/n2;
    }
}