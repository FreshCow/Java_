package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void mathod() {
        System.out.println("Child.Method");
    }
}
