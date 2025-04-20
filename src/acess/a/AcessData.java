package acess.a;

public class AcessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void  publicMethod(){
        System.out.println("public 메소트" + publicField);
    }

     void  defaultMethod(){
        System.out.println("default 메소트" + defaultField);
    }

    private void  privateMethod(){
        System.out.println("private 메소트" + privateField);
    }

    public void innerAccess(){
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 100;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
