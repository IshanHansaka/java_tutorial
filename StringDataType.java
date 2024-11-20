public class StringDataType {
    public static void main(String[] args) {
        String name = new String("Ishan");
        System.out.println(name);

        System.out.println("Hello! " + name);

        System.out.println(name.concat(" Hansaka"));

        //string constant pool 
        //String is Immutable (can't change)
        name = name + "Silva";
    }
}