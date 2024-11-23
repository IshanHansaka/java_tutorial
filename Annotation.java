public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.ShowTheDateBelongsToThisClass();
    }
}

class A {
    public void ShowTheDateBelongsToThisClass() {
        System.out.println("In show A");
    }
}

class B extends A {
    @Override // this method is override supperclass method //
    public void ShowTheDateBelongsToThisClass() {
        System.out.println("In show B");
    }
}