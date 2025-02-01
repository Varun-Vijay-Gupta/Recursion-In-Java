public class Subsequences {
    public static void main(String[] args) {
        String str = "abc";
        String newstr = "";
        sub(str, newstr, 0);
    }
    public static void sub(String str, String newstr, int index){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(index);
        
        sub(str, newstr + current, index + 1);
        sub(str, newstr, index + 1);
    }
}
