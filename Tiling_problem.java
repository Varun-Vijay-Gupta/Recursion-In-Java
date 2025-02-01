public class Tiling_problem {
    public static void main(String[] args) {
        System.out.println(count(4, 3));
    }
    public static int count(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        return count(n - m, m) + count(n - 1, m);
        // tile placed vertically + tile placed horizontally
    }
}
