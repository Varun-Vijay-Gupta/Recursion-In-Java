public class Move_X_to_End {
    public static void main(String[] args) {
        String str = "axbxcdxx";
        String newstr = "";
        moveX(str, newstr, 0, 0);
    }
    public static void moveX(String str, String newstr, int count, int index){

        if(index == str.length()){
            for(int i = 0; i <= count; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(index);
        if(current == 'x'){
            count++;
        }
        else{
            newstr += current;
        }
        moveX(str, newstr, count, index + 1);

    

    }
}
