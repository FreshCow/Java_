package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 실행결과");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("Parent2 실행결과");
        call(parent2);
    }


    private static void call(Parent parent) {
        parent.parentmehod();

        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
