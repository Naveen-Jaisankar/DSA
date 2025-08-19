package BitManipulation;

public class CheckIfIthBItIsSet {
    /*
    To check if the ith bit is set or not, we can use & and << or & and >> operator.
    Using & and << operator, the formula is N & (1<<i) != 0
    Using & and >> operator, the formula is (N>>i) & 1 != 0
     */
    public static void main(String[] args) {
        int a = 13; //binary value is 1011
        int i = 1;

        if ((a & (1 << i)) != 0) {
//        if (((a>>i) & N) != 0) {
            System.out.println("Bit is set");
        }else{
            System.out.println("Bit is not set");
        }


    }
}
