package arrays.strings;

public class maxMin {
    public static void main(String[] args) {
        int a[] = {0,9,8,7,6,5,4,3,2,1};
        int max = 0;
        int min = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("max number in array "+max);
        System.out.println("min number in array "+min);
    }
}
