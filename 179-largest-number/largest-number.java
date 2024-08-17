
class Solution{

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
     
        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < strs.length - 1; j++) {
                String leftRight = strs[j] + strs[j + 1];
                String rightLeft = strs[j + 1] + strs[j];
                if(leftRight.compareTo(rightLeft) < 0) {
                  
                    String temp = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = temp;
                }
            }
        }
        
    
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s);
        }
        while(sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
