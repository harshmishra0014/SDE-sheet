public class SetMartrixZeroes_day1
{
    static void printMatrix(int matrix[][])
    {
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
    static void set0(int matrix[][])
    {
        int col0 = 1;        // initially taking a[0][0] as non zero
        int rows = matrix.length, cols = matrix[0].length;

        // traversing the matrix
        for (int i = 0; i < rows; i++)
        {
            if (matrix[i][0] == 0) col0 = 0;    // in first column is zero then set col0 as 1 which is used later to assign value
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)  //checking for 0 in matrix
                    matrix[i][0] = matrix[0][j] = 0;   //doing leftmist and topmost as 0
        }

        for (int i = rows - 1; i >= 0; i--)     //reverse traversing
        {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0) //if leftmost or topmost value are 0 then change value to 0
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;    //after check for col0 if 0 then assign  in that column
        }
    }
    public static void main(String args[])
    {   //driver code
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        printMatrix(matrix);
        set0(matrix);
        printMatrix(matrix);
    }
}





