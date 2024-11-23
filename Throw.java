public class Throw {
    public static void main(String[] args) {
        int i = 2;  
        int j = 0;
        int result;
        try {
            if (j == 0) throw new ArithmeticException("Can't divide by zero");
            result = i/j;
            System.out.println(result);
        } catch (ArithmeticException e){
            result = i/1;
            System.out.println("This is default output " + e);
        }
    }
}