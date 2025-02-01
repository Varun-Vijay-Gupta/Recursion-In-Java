public class Sum {
    public static void main(String[] args) {
        sumOfNum(5, 0);
    }
    public static void sumOfNum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sumOfNum(n - 1, sum);
    }
}
