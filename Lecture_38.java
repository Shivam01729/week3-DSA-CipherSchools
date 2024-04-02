public class Lecture_38 {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move pointers towards each other
            left++;
            right--;
        }
        
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String original = "Hello, world!";
        String reversed = reverse(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}
