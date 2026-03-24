public class puzzle12 {
    public static void main(String[] args) {
        int n = 500;

        for (int i = 1; ; i++) {
            int num = (i * (i + 1)) / 2; // Triangular number formula
            int divisors = countDivisors(num);
            if (divisors > n) {
                System.out.println(num);
                break;
            }
        }
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
