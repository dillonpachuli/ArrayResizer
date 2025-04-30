public class Main{
    public static void main(String[] args) {
        int[][] array = {
            {2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}
        };
        for (int i = 0; i < array.length; i++){
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
                if (j != array[i].length-1) System.out.print(" ");
            }
            System.out.println("}");
        }
        ArrayResizer a = new ArrayResizer();
        System.out.println(a.isNonZeroRow(array, 0));
        System.out.println(a.isNonZeroRow(array, 1));
        System.out.println(a.isNonZeroRow(array, 2));
        System.out.println(a.isNonZeroRow(array, 3));
        int[][] smaller = a.resize(array);
        for (int i = 0; i < smaller.length; i++){
            System.out.print("{");
            for (int j = 0; j < smaller[i].length; j++){
                System.out.print(smaller[i][j]);
                if (j != smaller[i].length-1) System.out.print(" ");
            }
            System.out.println("}");
        }
    }
}