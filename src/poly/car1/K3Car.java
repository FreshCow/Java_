package poly.car1;

public class K3Car implements Car{

    @Override
    public void CarOn() {
        System.out.println("K3 시동 ON");
    }

    @Override
    public void CarOff() {
        System.out.println("K3 시동 OFF");
    }

    @Override
    public void Move() {
        System.out.println("K3 이동");
    }
}
