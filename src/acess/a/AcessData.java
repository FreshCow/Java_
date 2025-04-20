package acess.a;

public class AcessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void  publicMethod(){
        System.out.println("public 메소드" + publicField);
    }

     void  defaultMethod(){
        System.out.println("default 메소드" + defaultField);
    }

    private void  privateMethod(){
        System.out.println("private 메소드" + privateField);
    }

    public void innerAccess(){
        System.out.println("내부호출");
        publicField = 200;
        defaultField = 100;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
