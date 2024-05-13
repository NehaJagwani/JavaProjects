public class Lab29_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "nehan";
        char result = findFirstNonRepeatedCharacter(str);
        if (result == '\0') {
            System.out.println("No non-repeated character found.");
        } else {
            System.out.println("First non-repeated character: " + result);
        }
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;

        }

        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeated character found, return null character
        return '\0';
    }
}

