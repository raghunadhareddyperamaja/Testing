package arrays.strings;

import java.util.Arrays;

public class fillArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int b = -1;
        Arrays.fill(a,b);
        System.out.println(Arrays.toString(a));
    }
}
