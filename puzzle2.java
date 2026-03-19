public class puzzle2 {
    public static void main(String [] args){
        int stop = 4000000;
        int a = 0;
        int b = 1;
        long sum = 0;
        while (b <= stop) {
            int old = b;
            b = a + b;
            a = old;
            if (b % 2 == 0) {
                sum += b;
            }
        }
        System.out.println(sum);
    }
    
}