package arraysandstrings;

public class ColumnRowZeroes {

    public static void setRowColumnZeroesWithAuxilarySpace(int[][] mat) {

        int rowLength = mat.length;
        int columnLength = mat[0].length;

        int rows[] = new int[rowLength];
        int columns[] = new int[columnLength];

        for(int i=0;i<rowLength;i++) {
            for(int j=0; j<columnLength; j++) {
                if(mat[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for(int i=0;i<rowLength;i++) {
            System.out.print(rows[i]+" ");
        }
        System.out.println();

        for(int i=0; i<rowLength; i++) {
            for(int j=0; j< columnLength; j++) {
                if(rows[i] == 1 || columns[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void setRowColumnZeroes(int[][] mat) {

        int rowLength = mat.length;
        int columnLength = mat[0].length;

        boolean rowFlag = false;
        boolean columnFlag = false;

        for(int i=0;i<rowLength;i++) {
            for(int j=0;j<columnLength;j++) {
                if(i==0 && mat[i][j] == 0) {
                    rowFlag = true;
                }
                if(j==0 && mat[i][j] == 0) {
                    columnFlag = true;
                }

                if(mat[i][j] == 0 ) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for(int i=1;i<rowLength;i++) {
            for(int j=1;j<columnLength;j++) {
                if(mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if(rowFlag) {
            for(int i=0;i<columnLength;i++) {
                mat[0][i] = 0;
            }
        }
        if(columnFlag) {
            for(int j=0;j<rowLength;j++) {
                mat[j][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int mat[][] =
                {
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}
                };

        setRowColumnZeroes(mat);
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
