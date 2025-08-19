package BitManipulation;
public class SwapTwoNumbers {
    public static void main(String [] args) {
        int a = 5;
        int b = 6;

        System.out.println("Using Bit Manipulation");
        System.out.println("Before : a -> " + a + "; b ->" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After : a -> " + a + "; b ->" + b);

    }
}
