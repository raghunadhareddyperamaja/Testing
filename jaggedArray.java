package arrays.strings;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows = s.nextInt();
        int jaggedarray[][] = new int[rows][];
        for (int i = 0; i < rows; i++){
            System.out.println("enter the number of columns for the row of "+(i+1));
            int cols = s.nextInt();
            jaggedarray[i] = new int[cols];
            System.out.println("Enter " + cols + " values for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print("Value " + (j + 1) + ": ");
                jaggedarray[i][j] = s.nextInt();
            }
        }
        for (int k = 0; k< jaggedarray.length; k++){
            for (int l = 0; l< jaggedarray[k].length; l++){
                System.out.print(jaggedarray[k][l]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
