public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int result1 = num1 + num2;
        System.out.println(result1);

        int result2 = num1 - num2;
        System.out.println(result2);

        int result3 = num1 * num2;
        System.out.println(result3);

        int result4 = num1 / num2;
        System.out.println(result4);

        int result5 = num1 % num2;
        System.out.println(result5);

        num1 += 5;
        System.out.println(num1);

        num1 -= 7;
        System.out.println(num1);

        num1++; //post increament
        ++num1; //pre increament
        num1--; //post decreament
        --num1; // pre decreament
        System.out.println(num1);
    }
}
