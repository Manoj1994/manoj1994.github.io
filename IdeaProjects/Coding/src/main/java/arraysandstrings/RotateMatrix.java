package arraysandstrings;

public class RotateMatrix {

    public static void rotateMatrix(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;

        for(int i=0; i< rows/2; i++) {
            for(int j=i; j<rows-i-1; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][rows-1-i];
                mat[j][rows-1-i] = mat[rows-1-i][rows-1-j];
                mat[rows-1-i][rows-1-j] = mat[rows-1-j][i];
                mat[rows-1-j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };

        rotateMatrix(mat);

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
