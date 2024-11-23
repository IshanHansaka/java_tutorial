public class FunctionalInterfaces {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                            System.out.println("In show A");
                        }
        };

        obj.show();
    }
}

@FunctionalInterface // called As "SAM (Single Abstract Method)"
interface A {
    void show();
}