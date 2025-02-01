public class Keypad {
    public static void main(String[] args) {
        String str = "23";
        
        keypad(str, 0, "");
    }
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void keypad(String str, int index, String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(index);
        String mapping = keypad[current - '0'];

        for(int i = 0; i < mapping.length(); i++){
            keypad(str, index + 1, newstr + mapping.charAt(i));
        }

    }
}
