package recursion;

public class TotalSteps {

    public int calculateSteps(int n1, int n2) {
        if(n1 == 1 || n2 == 1) {
            return 1;
        }

        return calculateSteps(n1-1, n2) + calculateSteps(n1, n2-1);
    }

    public int calculateStepsWithSpace(int rows, int columns) {

        int steps[][] = new int[rows][columns];

        for(int i=0;i<rows;i++) {
            steps[i][0] = 1;
        }

        for(int i=0;i<columns;i++) {
            steps[0][i] = 1;
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<columns;j++) {
                steps[i][j] = steps[i-1][j] + steps[i][j-1];
            }
        }
        return steps[rows-1][columns-1];
    }

    public int calculateStepsWithObstacles(int arr[][], int i, int j) {

        if( i<0 || j<0) {
            return 0;
        }

        if(arr[i][j] == 1) {
            return 0;
        }

        if( i == 0 && j == 0) {
            return 1;
        }

        return calculateStepsWithObstacles(arr, i-1, j) + calculateStepsWithObstacles(arr, i, j-1);
    }

    public int caculateStepsWithObstaclesWithSpace(int arr[][]) {

        int rows = arr.length;
        int columns = arr[0].length;

        int[][] mat = new int[rows][columns];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                if(i==0 && j==0) {
                    if(arr[i][j] == 1) {
                        mat[i][j] = 0;
                    } else {
                        mat[i][j]=1;
                    }
                } else if(i==0 && arr[i][j] == 0) {
                    mat[i][j] = mat[i][j-1];
                } else if(j==0 && arr[i][j] == 0) {
                    mat[i][j] = mat[i-1][j];
                } else {
                    if(arr[i][j] == 0) {
                        mat[i][j] = mat[i-1][j] + mat[i][j-1];
                    }
                }

            }
        }

        return mat[rows-1][columns-1];
    }

    public static void main(String[] args) {
        TotalSteps steps = new TotalSteps();
        int n = 10;
        System.out.println(steps.calculateSteps(10, 10));
        System.out.println(steps.calculateStepsWithSpace(10, 10));

        int mat[][] =
                {
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {1, 0, 0, 0},
                        {0, 0, 1, 0}
                };

        System.out.println(steps.calculateStepsWithObstacles(mat, mat.length-1, mat[0].length-1));
        System.out.println(steps.caculateStepsWithObstaclesWithSpace(mat));

    }
}
