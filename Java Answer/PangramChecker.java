import java.util.HashSet;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle both upper and lower case characters
        input = input.toLowerCase();

        // Create a set to store the letters found in the input
        HashSet<Character> letterSet = new HashSet<>();

        // Iterate through the input and add letters to the set
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }

        // Check if the set contains all the letters from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            if (!letterSet.contains(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        // String input = "My name is V@ibh@v";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
