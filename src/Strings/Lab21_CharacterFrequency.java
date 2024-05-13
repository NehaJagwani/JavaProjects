package Strings;

public class Lab21_CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hello World$$$&&_1";

        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);

            if (count[ch] != 0) {
                System.out.println("The character is" + " " + ch + " " + "and count is" + " " + count[ch]);
                count[ch] = 0; // Reset the count for this character to avoid printing it again
            }
        }
    }
}
