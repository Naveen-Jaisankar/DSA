package BitManipulation;

public class CountNumberOfSetBits {
    public static void main(String[] args) {
        int count = 0;
        int n = 13;

        //Method 1
//        while(n!=0){
//            count+=n&1;
//            n=n>>1;
//        }
        //Method 2
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println("Number of Set bits : " + count);
    }
}
