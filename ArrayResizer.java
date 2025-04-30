public class ArrayResizer{
    public static boolean isNonZeroRow(int[][] array2D, int r){
        for (int col: array2D[r]){
            if (col == 0) return false;
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D){
        int num = 0;
        for (int i = 0; i < array2D.length; i++){
            if (isNonZeroRow(array2D, i)) num++;
        }
        return num;
    }

    public static int[][] resize(int[][] array2D){
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
        int i = 0;
        for (int j = 0; j < array2D.length; j++){
            if (isNonZeroRow(array2D, j)){
                newArray[i] = array2D[j];
                i++;
            }
        }
        return newArray;
    }
}