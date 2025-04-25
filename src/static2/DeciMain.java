package static2;

public class DeciMain {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String decoStr = decoUtil1.deco(s);

        System.out.println(decoStr);
    }
}
