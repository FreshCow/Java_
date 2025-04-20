package acess.a;

public class AccessMain {
    public static void main(String[] args) {
        AcessData acessData = new AcessData();
        acessData.publicField = 12;
        acessData.publicMethod();

        acessData.defaultField = 10;
        acessData.defaultMethod();

        acessData.innerAccess();
    }
}
