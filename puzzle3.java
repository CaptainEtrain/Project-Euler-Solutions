
public class puzzle3 {

    public static void main(String[] args) {
        long n = 600851475143L;
        long maxPrime = -1;

        //If even --> Can always devide by 2
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // What is left over is a prime
        if (n > 2) { 
            maxPrime = n;
        }

        System.out.println(maxPrime);

    }
}
