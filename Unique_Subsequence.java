import java.util.HashSet;

public class Unique_Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        String newstr = "";
        HashSet<String> set = new HashSet<>();
        uniqueSub(str, newstr, 0, set);
    }
    public static void uniqueSub(String str, String newstr, int index, HashSet<String> set){
        if(index == str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                set.add(newstr);
                System.out.println(set);
                return;
            }
        }
        char current = str.charAt(index);

        uniqueSub(str, newstr + current, index + 1, set);
        uniqueSub(str, newstr, index + 1, set);
    }
}
