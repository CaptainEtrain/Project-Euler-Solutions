
public class puzzle4 {

    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int x = -1;
        int y = -1;
        int max = -1;
        while (a < 1000) {
            b = a;
            while (b < 1000) {
                if (isPalindromic(a * b)) {
                    if (a * b > max) {
                        max = a * b;
                        x = a;
                        y = b;
                    }
                }
                b++;
            }
            a++;
        }
        System.out.printf("%d =   %d  * %d \n", max, x, y);

    }

    public static boolean isPalindromic(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            int len = str.length();
            if (!str.substring(i, i + 1).equals(str.substring(len - i - 1, len - i))) {
                return false;
            }
        }
        return true;
    }
}
