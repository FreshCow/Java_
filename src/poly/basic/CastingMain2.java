package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
//        poly.childMethod();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생

        //다운캐스팅(부모 -> 자식)
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

        //업캐스팅
        //다운캐스팅과 반대로 현재 타입을 부모 타입으로 변경하는 것을 업캐스팅이라 한다.


    }
}
