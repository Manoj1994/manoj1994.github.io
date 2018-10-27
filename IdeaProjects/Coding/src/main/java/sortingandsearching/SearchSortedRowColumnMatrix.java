package sortingandsearching;

public class SearchSortedRowColumnMatrix {

    public void search(int[][] arr, int target) {
        int rows = arr.length;
        if(rows == 0) {
            System.out.println("Array is empty");
        }
        int columns = arr[0].length;

        int x = 0, y =  columns-1;

        while(y >= 0 && x < rows) {
            if(arr[x][y] == target) {
                System.out.println(x +" "+y);
                return;
            } else if( arr[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }

        System.out.println("Element is not found");
    }

    public static void main(String[] args) {

        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };

        SearchSortedRowColumnMatrix searchS1 = new SearchSortedRowColumnMatrix();
        searchS1.search(mat, 23);
    }
}
