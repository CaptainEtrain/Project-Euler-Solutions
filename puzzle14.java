public class puzzle14 {
    public static void main(String[] args) {
        int max  =  -1;
        int solution = -1;
        for (int i = 0; i < 1000000; i++) {
            int x = collatzLen((long) i);
            if (x > max) {
                max = x;
                solution = i;
            }
        }
        System.out.println(solution);
    }
    public static int collatzLen(long n) {
        int count = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n) + 1;
            }
            count++;
        }
        return count;
    }
}
