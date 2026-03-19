
public class puzzle7 {

    public static void main(String[] args) {
        int count = 0;
        int x = 2;
        int max = -1;
        while (count < 10001) {
            boolean isPrime = true;

            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                max = x;
                System.out.println(max);
                count++;
            }
            x++;
        }
        System.out.println(max);
    }
}
