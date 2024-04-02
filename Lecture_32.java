public class Lecture_32 {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate strings
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // Length of a string
        int length = concatenated.length();
        System.out.println("Length of concatenated string: " + length);

        // Convert string to uppercase
        String upperCaseString = concatenated.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // Convert string to lowercase
        String lowerCaseString = concatenated.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);

        // Substring
        String substring = concatenated.substring(3, 8);
        System.out.println("Substring: " + substring);

        // Check if a string contains another string
        boolean containsWorld = concatenated.contains("World");
        System.out.println("Does concatenated string contain 'World'?: " + containsWorld);

        // Replace characters in a string
        String replacedString = concatenated.replace('o', '0');
        System.out.println("String with 'o' replaced by '0': " + replacedString);

        // Split string
        String[] splitArray = concatenated.split(" ");
        System.out.println("Split string:");
        for (String s : splitArray) {
            System.out.println(s);
        }

        // Compare strings
        String str3 = "Hello World";
        boolean areEqual = concatenated.equals(str3);
        System.out.println("Are concatenated string and 'Hello World' equal?: " + areEqual);

        // Check if a string starts with a specific prefix
        boolean startsWithHello = concatenated.startsWith("Hello");
        System.out.println("Does concatenated string start with 'Hello'?: " + startsWithHello);
    }
}
