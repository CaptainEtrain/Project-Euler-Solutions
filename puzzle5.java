public class puzzle5 {
    public static void main(String[] args) {
        int x = 1;
        int n = 20;
        for (int i = 2; i <= n; i++) {
            if (x % i != 0) {
                x+=1;
                i = 2;
            }
        }
        System.out.println(x);
    }
}
