package BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int count = 0;
        int n = 15;
        while(n>0){
//            count += (n&1);
//            n = n>>1;
            n = n & (n-1);
            count++;
        }
        System.out.println("Number of set bits : " + count);

    }
}
