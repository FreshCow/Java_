package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentmehod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentmehod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentmehod();

        //자식의 기능을 호출할 수 없다. 컴파일 오류

    }
}
