class Student {
    String name;
    int age;
    double marks;
}

public class EnhancedLoop {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 8;
        arr[3] = 9;

        for (int a: arr){
            System.out.println(a);
        }

        Student s1 = new Student();
        s1.name = "ishan";
        s1.age = 21;
        s1.marks = 85.1;

        Student s2 = new Student();
        s2.name = "Hansaka";
        s2.age = 19;
        s2.marks = 64.9;

        Student s3 = new Student();
        s3.name = "silva";
        s3.age = 22;
        s3.marks = 92.5;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student: students) {
            System.out.println(student.name + " " + student.age + " " + student.marks);
        }
    }
}
