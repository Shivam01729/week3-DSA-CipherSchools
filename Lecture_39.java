public class Lecture_39 {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0,right = str.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;right--;
        }return true;
    }
    
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panama";
        String str2 = "racecar";
        String str3 = "hello";
        
        System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2));
        System.out.println("Is \"" + str3 + "\" a palindrome? " + isPalindrome(str3));
    }    
}
