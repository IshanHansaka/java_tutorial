public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Ishan");
        System.out.println(str);

        str.append(" Hansaka");
        System.out.println(str);

        str.insert(0, "Java ");
        System.out.println(str); 
    }
}
