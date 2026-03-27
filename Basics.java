package arrays.strings;

public class Basics {
    public static void main(String[] args) {
        // 1. Create StringBuilder and StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbuf = new StringBuffer("World");

        System.out.println("Initial StringBuilder: " + sb);
        System.out.println("Initial StringBuffer: " + sbuf);

        // 2. Append different data types
        sb.append(" Java");
        sbuf.append(" 2025");

        System.out.println("\nAfter append:");
        System.out.println("StringBuilder: " + sb);  // Hello Java
        System.out.println("StringBuffer: " + sbuf); // World 2025

        // 3. Insert characters or substrings
        sb.insert(6, "Awesome ");
        sbuf.insert(5, "-Buffered");

        System.out.println("\nAfter insert:");
        System.out.println("StringBuilder: " + sb);   // Hello Awesome Java
        System.out.println("StringBuffer: " + sbuf);  // World-Buffered 2025

        // 4. Delete characters or substrings
        sb.delete(6, 14); // remove "Awesome "
        sbuf.delete(5, 14); // remove "-Buffered"

        System.out.println("\nAfter delete:");
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbuf);

        // 5. Replace a portion of text
        sb.replace(6, 10, "C++");
        sbuf.replace(6, 10, "****");

        System.out.println("\nAfter replace:");
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbuf);

        // 6. Reverse the strings
        System.out.println("\nReversed:");
        System.out.println("StringBuilder: " + sb.reverse());
        System.out.println("StringBuffer: " + sbuf.reverse());

        // 7. Length and capacity
        System.out.println("\nLength & Capacity:");
        System.out.println("StringBuilder Length: " + sb.length() + ", Capacity: " + sb.capacity());
        System.out.println("StringBuffer Length: " + sbuf.length() + ", Capacity: " + sbuf.capacity());

        // 8. Set character at index
        sb.setCharAt(0, 'X');
        sbuf.setCharAt(0, 'Y');

        System.out.println("\nAfter setCharAt:");
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbuf);

        // 9. Convert to String
        String str1 = sb.toString();
        String str2 = sbuf.toString();

        System.out.println("\nConverted to String:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
