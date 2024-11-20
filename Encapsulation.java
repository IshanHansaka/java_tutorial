class Human {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

public class Encapsulation {
    public static void main(String[] args) {
        Human man1 = new Human();
        man1.setName("Ishan");
        man1.setAge(21);
        System.out.println(man1.getName() + " is " + man1.getAge() + " years old");
    }
}