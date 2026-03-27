package arrays.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int b[] = Arrays.copyOf(a,14);
        System.out.println("original array "+Arrays.toString(a));
        System.out.println("Copy Array "+Arrays.toString(b));
    }
}
