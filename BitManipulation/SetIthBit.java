package BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 9; // 1001
        int i = 2;

        int res = n | (1<<i);
        System.out.println("Result is : " +  res);
    }
}
