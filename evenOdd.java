package arrays.strings;

public class evenOdd {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("even numbers in array is: "+even);
        System.out.println("odd numbers in array is: "+odd);
    }
}
