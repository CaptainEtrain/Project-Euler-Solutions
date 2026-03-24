import java.math.BigInteger;
public class puzzle16 {
    public static void main(String[] args) {
        BigInteger base = new BigInteger("2");
        BigInteger x = base.pow(1000);
        //System.out.println(x); Huge number
        
        int sum = 0;
        while (x.compareTo(BigInteger.ZERO) > 0) {
            sum += x.mod(BigInteger.TEN).intValue();
            x = x.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }
}
