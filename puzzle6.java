public class puzzle6 {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(squareOfSum(x) - sumOfSquares(x));
    }
    public static long sumOfSquares(int x) {
        long sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static long squareOfSum(int x) {
        long sum = 0L;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        sum *= sum;
        return sum;
    }
}
