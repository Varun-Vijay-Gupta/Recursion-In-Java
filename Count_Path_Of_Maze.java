public class Count_Path_Of_Maze {
    public static void main(String[] args) {
        System.out.println(count(0, 0, 3, 3));
    }
    public static int count(int i, int j, int n, int m){
        if(i == m - 1 || j == n - 1){
            return 1;
        }
        // right move
        int rightPath = count(i, j + 1, n, m);
        // down move
        int downPath = count(i + 1, j, n, m);

        return rightPath + downPath;
    }
}
