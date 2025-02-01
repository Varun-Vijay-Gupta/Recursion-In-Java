public class X_Power_n {
    public static void main(String[] args) {
        int c = pow(2, 5);
        System.out.println(c);
    }
    public static int pow(int x, int n){

        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        
        int output = x * pow(x, n - 1);

        return output;
    }
}
