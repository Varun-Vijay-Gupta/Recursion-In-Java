public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        TOH(3, "S", "H", "D");
    }
    public static void TOH(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk"+ n +" from "+ src + " to " + dest);
            return;
        }
        // to move n - 1 disks from source to helper using dest
        TOH(n - 1, src, dest, helper);

        // to move last disk from source to dest 
        System.out.println("Transfer disk"+ n +" from "+ src + " to " + dest);

        // to move n - 1 disks from helper to dest using source
        TOH(n - 1, helper, src, dest);
    }
}
