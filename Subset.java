import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> set = new ArrayList<>();
        subset(n, set);
    }
    public static void printset(ArrayList<Integer> set){
        for(int i = 0; i < set.size(); i++){
            System.out.print(set.get(i) + " ");
        }
        System.out.println();
    }
    public static void subset(int n, ArrayList<Integer> set){
        if(n == 0){
            printset(set);
            return;
        }
        // include in set
        subset(n - 1, set);
        set.add(n);
        // not include in set
        subset(n - 1, set);
        set.remove(set.size() - 1);
    }
}
