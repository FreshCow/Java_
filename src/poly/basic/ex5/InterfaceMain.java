package poly.basic.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스, 생성 불가 완전추상화
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
