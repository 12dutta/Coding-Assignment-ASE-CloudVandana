import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        // Create a map to store the values for each Roman numeral symbol
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = 0;
        int prevValue = 0;
        // Start from the end of the string and work backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }
        return result;
    }
    public static void main(String[] args) {
        String romanNumeral = "XII";
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);
    }
}
