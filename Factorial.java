public class Factorial {
    public static void main(String[] args) {
        fact(5, 1);
    }
    public static void fact(int n, int sum){
        if(n == 0 || n == 1){
            System.out.println(sum);
            return;
        }
        sum *= n;
        fact(n - 1, sum);
    }
}
