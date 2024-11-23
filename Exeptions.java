// Exceptions are runtime errors

// Exceptions can handle but errors can't handle it stops compilation process

// Checked Exceptions
// Unchecked Exceptions

public class Exeptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int arr[] = {1, 2, 3, 4, 5};
        String str = null;
        try {
            int result = i/j;
            System.err.println(arr[5]);
            System.out.println(str.length());
            
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Access out of bound index");
        } catch (Exception e) {
            System.out.println("Somthing went wrong.. " + e);
        }
    }
}
