class Solution {
    public String intToRoman(int num) {
        // Define the mappings of integers to Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // Initialize a StringBuilder to build the Roman numeral
        StringBuilder roman = new StringBuilder();
        
        // Iterate over the values array
        for (int i = 0; i < values.length; i++) {
            // While the number is larger than or equal to the current value
            while (num >= values[i]) {
                // Append the corresponding Roman numeral
                roman.append(numerals[i]);
                // Subtract the value from the number
                num -= values[i];
            }
        }
        
        // Return the resulting Roman numeral string
        return roman.toString();
    }
}
