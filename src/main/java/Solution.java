public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[][] matrix2D;
        matrix2D =  matrix;

        int t; int column=0;
        for (t = 0; t < matrix2D[0].length; t++) {   //column traversal
            if (matrix2D[0][t] >= target) {
       //         t = ((t - 1)==0 ) ? 1 : 0;
                t=t-1;
                break;
            }
        }

        try{
            for (int y = 0; y < matrix2D.length; y++) {     //row traversal
                if (matrix2D[column][y] == target) {
                    return true;
                }}}catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }return false;
    }

}


