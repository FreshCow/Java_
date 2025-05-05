package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.mathod();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.mathod();
        
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //변수는 오버라이딩 안됨
        poly.mathod(); //메서드는 오버라이딩 됨
        
        //오버라이딩된 메서드는 우선권을 가짐 하위 자식 클래스의 오버라이딩 메서드가 우선권을 가짐
        
        //객체지향 캡슐화 상속, 다형성, 추상화
    }
}
