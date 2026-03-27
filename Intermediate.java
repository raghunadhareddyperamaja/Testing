package arrays.strings;

interface MyCalculator {
    int calculate(int a, int b);
}

public class Intermediate {
    public static void main(String[] args) {

        // 1. CAPITALIZE FIRST LETTER OF EACH WORD
        System.out.println("\n1. Capitalize Each Word:");
        String sentence = "hello java world";
        StringBuilder capitalized = new StringBuilder();
        for (String word : sentence.split(" ")) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1)).append(" ");
        }
        System.out.println("Capitalized: " + capitalized.toString().trim());

        // 2. Find All Duplicate Characters in a String
        System.out.println();
        String m = "programming";
        boolean[] visited = new boolean[256];
        System.out.print("2. Duplicate characters: ");
        for (int i = 0; i < m.length(); i++) {
            char c = m.charAt(i);
            if (m.indexOf(c) != m.lastIndexOf(c) && !visited[c]) {
                System.out.print(c + " ");
                visited[c] = true;
            }
        }

        String r = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // 3. Reverse a string using String Buffer and StringBuilder.
        StringBuffer rBuffer = new StringBuffer(r);
        rBuffer.reverse().toString();
        System.out.println();
        System.out.println("\n3 .Reversed using StringBuffer: " + rBuffer);

        StringBuilder rBuilder = new StringBuilder(r.toLowerCase());
        rBuilder.reverse().toString();
        System.out.println("Reversed using StringBuilder: " + rBuilder);

        String rs = "Hello World This Is Java";
        //4. Using StringBuilder, remove all spaces from a sentence efficiently.
        StringBuilder rsBuilder = new StringBuilder();
        for (char c : rs.toCharArray()) {
            if (c != ' ') {
                rsBuilder.append(c);
            }
        }
        System.out.println("\n4. Without spaces: " + rsBuilder.toString());

        // 5. Lambda Expression
        System.out.println("\n5. Lambda Expression");
        MyCalculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(10, 5));

        MyCalculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));

        MyCalculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));

        MyCalculator division = (a, b) -> b != 0 ? a / b : 0;
        System.out.println("Division: " + division.calculate(10, 5));


        // 1. PERFORMANCE COMPARISON
        System.out.println("\n1. Performance Comparison:");
        long start, end;

        StringBuilder sbBuilder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbBuilder.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        StringBuffer sbBuffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbBuffer.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");

        // 2. PALINDROME CHECK
        System.out.println("\n2. Palindrome Check:");
        String input = "madam";
        boolean isPalindrome = input.equals(new StringBuilder(input).reverse().toString());
        System.out.println(input + " is " + (isPalindrome ? "" : "not ") + "a palindrome");


        // 3. CAMEL CASE CONVERSION
        System.out.println("\n3. Convert snake_case to CamelCase:");
        String snake = "this_is_an_example";
        StringBuilder camelCase = new StringBuilder();
        String[] parts = snake.split("_");
        for (String part : parts) {
            camelCase.append(Character.toUpperCase(part.charAt(0)))
                    .append(part.substring(1));
        }
        System.out.println("CamelCase: " + camelCase.toString());

        // 4. CUSTOM REPLACE WITHOUT .replace()
        System.out.println("\n4. Custom Replace (Manual):");
        StringBuilder text = new StringBuilder("Hello NAME, welcome to PLACE!");
        String target = "NAME";
        String replacement = "Raghu";

        int index = text.indexOf(target);
        if (index != -1) {
            text.delete(index, index + target.length());
            text.insert(index, replacement);
        }

        target = "PLACE";
        replacement = "Wonderland";
        index = text.indexOf(target);
        if (index != -1) {
            text.delete(index, index + target.length());
            text.insert(index, replacement);
        }

        System.out.println("After custom replace: " + text.toString());
    }


}

