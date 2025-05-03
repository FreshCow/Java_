package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.Hello");
    }

    public void call(){
        System.out.println("This Value =" + this.value); //this생략가능
        System.out.println("This Value =" + super.value);

        this.hello();
        super.hello();
    }
}
