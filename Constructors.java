public class Constructors {
    public static void main(String[] args) {
        Human man1 = new Human();
        man1.display();

        Human man2 = new Human("ishan hansaka", 21);
        man2.display();
    }
}

class Human {
    String name;
    int age;

    //default constructor
    public Human() {
        name = "John Doe";
        age = 18;
    }

    //parameterized constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " is " + age + " year old.");
    }
}