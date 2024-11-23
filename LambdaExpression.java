public class LambdaExpression {
    public static void main(String[] args) {

        // Example 01
        A obj1 = new A() 
        {
            public void show() {
                System.out.println("In show A");
            }
        };
        obj1.show();

        // Use lamda exprssions
        A obj2 = () -> 
            {
                System.out.println("In show A");
            };
        obj2.show();

        // Use lamda exprssions
        A obj3 = () -> System.out.println("In show A");
        obj3.show();

        //Example 02
        B obj4 = new B() 
        {
            public void show(int a) {
                System.out.println("In show B " + a);
            }
        };
        obj4.show(5);

        // Use lamda expressions
        B obj5 = (int a) -> System.out.println("In show B " + a);
        obj5.show(5);

        // Use lamda expressions
        B obj6 = (a) -> System.out.println("In show B " + a);
        obj6.show(5);

        // Use lamda expressions
        B obj7 = a -> System.out.println("In show B " + a);
        obj7.show(5);

        //Example 03
        C obj8 = new C() 
        {
            public int show(int i, int j) {
                return i+j;
            }
        };
        System.out.println("In show C "+ obj8.show(5, 6));

        // Use lamda expressions to return type method with multiple prameters
        C obj9 = (int i, int j) -> i+j;
        System.out.println("In show C "+ obj9.show(5, 6));

        // Use lamda expressions to return type method with multiple prameters
        C obj10 = (i, j) -> i+j;
        System.out.println("In show C "+ obj10.show(5, 6));
    }
}

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void show(int a);
}

@FunctionalInterface
interface C {
    int show(int i, int j);
}