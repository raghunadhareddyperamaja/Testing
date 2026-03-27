package arrays.strings;

import java.util.Scanner;

public class productPrice {
    public static void main(String[] args) {
        int []price = {1,2,3,4,5,6,7,8,9,1};
        int a = 0;
        Scanner b = new Scanner(System.in);
        System.out.println("enter the user input");
        int user = b.nextInt();
        for (int i = 0; i<price.length; i++){
            if (user == price[i]){
                a = 1;
                System.out.println("user and price exist");
            }
        }
        if (a == 0){
            System.out.println("user price doesn't exist");
        }
    }
}
