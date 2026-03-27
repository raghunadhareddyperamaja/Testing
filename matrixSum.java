package arrays.strings;

import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for (int k = 0; k< a.length; k++){
            for (int l = 0; l< a[k].length; l++){
                System.out.print(a[k][l]+" ");
                sum += a[k][l];
            }
            System.out.println();
//            System.out.println(sum);
        }
        System.out.println("sum of all elements of matrix is :"+sum);
        Scanner s = new Scanner(System.in);
        int b[][] = new int [3][3];
        int c = 0;
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("b["+i+"]["+j+"]  ");
                b[i][j] = s.nextInt();
            }
        }
        for (int k = 0; k< a.length; k++){
            for (int l = 0; l< a[k].length; l++){
                System.out.print(a[k][l]+" ");
                c += a[k][l];
            }
            System.out.println();
        }
        System.out.println("sum array from user input "+c);
        s.close();
    }
}
