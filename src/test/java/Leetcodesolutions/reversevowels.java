package Leetcodesolutions;

public class reversevowels {

    public static void main(String[] args) {
        String input = "hello";
        String result = reverseVowels(input);
        System.out.println(result); // Output: holle
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        // Convert the string to a character array
        char[] chars = s.toCharArray();

        // Define the vowels
        String vowels = "aeiouAEIOU";

        // Initialize two pointers
        int left = 0;
        int right = chars.length - 1;

        // Process the characters
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            // Move the right pointer to the previous vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers towards the center
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(chars);
    }
}
