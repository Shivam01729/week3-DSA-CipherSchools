public class Lecture_30 {
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
    }
}
