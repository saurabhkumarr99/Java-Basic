package C_NonPrimitiveDataType.B_Arrays.B_2D_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_2D_methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of column :");
        int x= sc.nextInt();
        System.out.print("Enter number of row :");
        int y= sc.nextInt();

        int[][] matrix =new int[y][x];
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                System.out.print("Insert ("+i+","+j+") element :");
                matrix[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("All element of matrix is :");
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
