
class Solution {
    public int singleNumber(int[] nums) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        
        // Populate the HashMap with counts of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with frequency 1 (which is the single number)
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        // In case no single number found (shouldn't happen in this problem)
        return -1;
    }
}
