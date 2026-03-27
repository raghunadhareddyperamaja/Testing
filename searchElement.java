package arrays.strings;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b[][] = new int [3][3];
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("b["+i+"]["+j+"]  ");
                b[i][j] = s.nextInt();
            }
        }
        for (int k = 0; k< b.length; k++){
            for (int l = 0; l< b[k].length; l++){
                System.out.print(b[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println("user required position");
        int r = s.nextInt();
        int c = s.nextInt();
        if (r < b.length && c < b.length){
            System.out.println("user required position of element is: "+b[r][c]);
        }
        else {
            System.out.println("user required position is error");
        }
    }
}
