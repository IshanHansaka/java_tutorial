public class IFCondition {
    public static void main(String[] args) {
        int a = 15;
        if (a < 10) {
            System.out.println("Hello");
        } else if (a < 15) {
            System.out.println("Bye");
        } else {
            System.out.println("Welcome");
        }

        int result = a >= 16 ? 1:2;
        System.out.println(result);
    }
}
