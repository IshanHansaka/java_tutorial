import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        System.out.print("Enter number : ");

        // Automatically close the resource after try block
        // No need a finally block to close resource
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
