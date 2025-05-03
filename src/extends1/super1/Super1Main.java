package extends1.super1;

public class Super1Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();

        Parent parent = new Parent();
        parent.hello();
    }
}
