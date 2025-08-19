package BitManipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 8; // 1001
        int i = 2;

        int res = n | (1<<i); // this set ith bit to 1
        int res1 = n & ~(1<<i); // this set ith bit to 0
        int res2 = n ^ (1<<i); // toggle the kth bit
        int res3 = n & (n-1); //remove the last set bit
        int res4 = n & (n-1); // check if the number is power of 2
        System.out.println("Result is : " +  res);
        System.out.println("Result1 is : " +  res1);
        System.out.println("Result2 is : " +  res2);
        System.out.println("Result3 is : " +  res3);
        System.out.println( (res4==0) ? n + " is power of 2" : n + " is not power of 2");
    }
}
