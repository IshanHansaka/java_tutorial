public class TypeCasting {
    public static void main(String[] args) {
        //explicit type casting
        float f =123.34f;
        int i = (int)f;
        System.err.println(i);

        //implicit type casting
        int j = 100;
        double d = j;
        System.err.println(d);

        //speacial
        int n = 128;
        byte b = (byte)n;
        System.err.println(b); //b = -128   128 => 10000000 (one's complement)
    }
}
