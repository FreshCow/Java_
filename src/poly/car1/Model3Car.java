package poly.car1;

public class Model3Car implements Car{
    @Override
    public void CarOn() {
        System.out.println("Model3 시동 ON");
    }

    @Override
    public void CarOff() {
        System.out.println("Model3 시동 OFF");
    }

    @Override
    public void Move() {
        System.out.println("Model3 이동");
    }
}
