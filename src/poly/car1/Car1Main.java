package poly.car1;

public class Car1Main {
    public static void main(String[] args) {
        K3Car k3 = new K3Car();
        k3.CarOn();
        k3.CarOff();
        k3.Move();

        Model3Car model3Car = new Model3Car();
        model3Car.CarOff();
        model3Car.CarOn();
        model3Car.Move();
    }
}
