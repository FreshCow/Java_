package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
//        poly.childMethod();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생

        //다운캐스팅(부모 -> 자식)
        Child child = (Child) poly;
        child.childMethod();
    }
}
