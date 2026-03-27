package arrays.strings;

public class UtilityMethods {

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();  // Make comparison case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reverse(number));

        String text = "Hello Java World!";
        System.out.println("Input String: " + text);
        System.out.println("Number of Vowels: " + countVowels(text));
    }
}

