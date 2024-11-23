public class Finally {
    public static void main(String[] args) {
        int i =8;
        int j = 0;
        int result;

        try {
            result = i/j;
        } catch (Exception e) {
            System.out.println("Can't divide by zero " + e);
        } finally {
            System.out.println("Bye");
        }
    }    
}

