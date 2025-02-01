public class Remove_Duplicates {
    public static void main(String[] args) {
        String str = "abbcddeggd";
        String newstr = "";
        duplicate(str, newstr, 0);
    }
    public static boolean[] map = new boolean[26];
    public static void duplicate(String str, String newStr, int index){
        if(index == str.length()){
            System.out.println(newStr);
        }
        char current = str.charAt(index);
        if(map[current - 'a']){
            duplicate(str, newStr, index + 1);
        }
        else{
            newStr += current;
            map[current - 'a'] = true;
            duplicate(str, newStr, index + 1);
        }
    }
}
