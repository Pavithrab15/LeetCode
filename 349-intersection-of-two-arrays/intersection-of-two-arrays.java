class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j< nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        
        for(int x : set){
            list.add(x);
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}