public class LargestPalindromeSubstring {
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static String maxLength(String str1, String str2) {
        return (str1.length() > str2.length()) ? str1 : str2;
    }
    
    public static String findLargestPalindromeSubstring(String str) {
        String largestPalindrome = "";
        int maxLength = 0;
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    largestPalindrome = substring;
                    maxLength = substring.length();
                }
            }
        }
        
        return largestPalindrome;
    }
    
    public static void main(String[] args) {
        String input = "Eye of the madam is red";
        String largestPalindrome = findLargestPalindromeSubstring(input);
        
        System.out.println("Input: " + input);
        System.out.println("Largest Palindrome Substring: " + largestPalindrome);
    }
}