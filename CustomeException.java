public class CustomeException {
    public static void main(String[] args) {
        int i = 2;  
        int j = 0;
        int result;
        try {
            if (j == 0) throw new IshanException("Can't divide by zero");
            result = i/j;
            System.out.println(result);
        } catch (IshanException e){
            result = i/1;
            System.out.println("This is default output " + e);
        }
    }
}

class IshanException extends RuntimeException{
    public IshanException(String str) {
        super(str);
    }
}