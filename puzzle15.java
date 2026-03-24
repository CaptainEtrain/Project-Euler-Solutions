//Those who know 
// 40 pick 20 = 40! / (20! * 20!)
// = 137,846,528,820
import java.math.BigInteger;

public class puzzle15 {
    public static void main(String[] args) {
        BigInteger result = factorial(40).divide(factorial(20).multiply(factorial(20)));

        System.out.println(result); 
    }

    public static BigInteger factorial(int x) {
        BigInteger product = BigInteger.ONE;

        for (int i = 2; i <= x; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        return product;
    }
}