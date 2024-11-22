public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 6;
        Integer num2 = new Integer(6); // boxing
        Integer num3 = 20; // auto boxing 
        
        int num4 = num2.intValue();  //unboxing
        int num5 = num3; //auto unboxing

        String str = "12";
        int num6 = Integer.parseInt(str);
    }
}
