public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        System.out.println(sort(arr, 0));
    }
    public static boolean sort(int[] arr, int index){
        if(arr.length - 1 == index){
            return true;
        }
        if(arr[index] < arr[index + 1]){
            return sort(arr, index + 1);
        }
        else{
            return false;
        }
    }
}
