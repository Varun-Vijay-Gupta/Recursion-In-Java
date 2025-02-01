public class Reverse_String {
    public static void main(String[] args) {
        String str = "abcd";
        revString(str, str.length() - 1);
    }
    public static void revString(String str, int index) {
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
       System.out.print(str.charAt(index));
       revString(str, index - 1);
        
}
}
