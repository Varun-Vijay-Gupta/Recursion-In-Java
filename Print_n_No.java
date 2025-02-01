public class Print_n_No{
    public static void main(String[] args) {
        printRev(5);
        print(0);
    }
    public static void printRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printRev(n - 1);
    }
    public static void print(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}