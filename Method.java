public class Method {
    public void playMusic() {
        System.out.println("Play Music..");
    } 
    public static void main(String[] args) {

        Method obj = new Method();
        obj.playMusic();

        Computer comp = new Computer();
        String value = comp.buyPen(5);
        System.out.println(value);

        Car car1 = new Car();
        System.out.println(car1.action);

    }
}

class Computer {
    public String buyPen(int cost) {
        if(cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

class Car {
String action = buyPen(0);

    public String buyPen(int cost) {
        if(cost > 0) {
            return "Rotating..";
        }
        return "Nothing";
    }
}