public class Occurance{
    public static void main(String[] args) {
        
        getindex("jabcdefgaahijakkk", 'a',0);
        System.out.println("First occurance: "+firstindex);
        System.out.println("Last Occurnace: "+lastindex);
    }

    public static int firstindex = -1;
    public static int lastindex = -1;
    public static void getindex(String str, int element, int index){
        if(index == str.length()){
            return;
        }

        if(str.charAt(index) == element){
            if(firstindex == -1){
                firstindex = index;
            }
            else{
                lastindex = index;
            }
        }
        getindex(str, element, index + 1);
    }
}