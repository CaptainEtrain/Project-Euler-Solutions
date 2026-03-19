public class puzzle0 {
    public static void main(String[] args) {
        long n = 651000;
        long sum = 0;
        for(long i = 1; i < n; i+=2){
            sum += i*i;
        }
        System.out.println(sum);
    }
}