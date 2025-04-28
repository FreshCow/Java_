package mathArrayUtills;
import static mathArrayUtills.mathArrayUtils.*;

public class mathMain {
    public static void main(String[] args) {
        int[] mathArrPlus = new int[]{1, 2, 3, 4, 5};

        System.out.println("sum = " + sum(mathArrPlus));
        System.out.println("Average = " + average(mathArrPlus));
        System.out.println("min = " + min(mathArrPlus));
        System.out.println("max = " + max(mathArrPlus));

    }
}
