public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[][] matrix2D;
        matrix2D = matrix;
        boolean truth = false;
        boolean no_result = false;

        if ((matrix2D.length == 1) && (matrix2D[0].length == 1)){
            if (matrix2D[0][0] != target) {
                return false;
            }
        }

        int column=0; int t = 0;
        try {
            for (t = 0; t < matrix2D[0].length; t++) { //down traversal
                if (matrix2D.length == 1){column = 1; t =1; break;}
                if (matrix2D[t][0] >= target) {
                    t = t - 1;
                    t = ((t - 1)==0 ) ? 1 : 0;
                    column = t;
                    no_result=false;
                    break;
                }
                no_result = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            if(no_result){truth = false;}
            t = ((t - 1) == -1) ? 1 : 0;
            column = t;
        }
        if(no_result){ truth = false;}
        column = t;
        int y=0;
        try {
            for (y = 0; y < matrix2D.length+1;y++) {//across traversal
                if (matrix2D[column][y] == target) {
                    truth = true;
                }
            }
        } catch (ArrayIndexOutOfBoundsException f) {
            f.printStackTrace();
            if(matrix2D[column][y-1] == target){truth = true;}
        }
        return truth;
    }

}


