package static2;

import static static2.DecoUtil1.*;

public class DeciMain {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String decoStr = decoUtil1.deco(s);

        String d = deco("java짱");

        System.out.println(decoStr);
        System.out.println(d);
    }
}
