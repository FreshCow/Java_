package poly.basic.ex3;

public class AbstracMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();;
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
