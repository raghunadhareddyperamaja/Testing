package arrays.strings;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int b = 5;
        System.out.println("Index of "+b+" is: "+ Arrays.binarySearch(a,b));
    }
}
