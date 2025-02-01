public class Friends_Pairing {
    public static void main(String[] args) {
        System.out.println(pairSingle(4));
    }
    public static int pairSingle(int n){
        if(n <= 1){
            return 1;
        }
        return pairSingle(n - 1) + ((n - 1) * pairSingle(n - 2));
        // inviting single friend + inviting friends in pair
    }
}
