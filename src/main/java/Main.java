public class Main {

    public static void main(String... args) {
        Solution solution = new Solution();
    //    int[][] matrix = {{1}};  //1
     //   int [][] matrix ={{1,1}};  //target 2
     //   int[][] matrix = {{1},{3}};
     //  int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};  //3
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};  //11
        int target =11;
        boolean answer = solution.searchMatrix(matrix, target);
        System.out.print(answer);
    }
}