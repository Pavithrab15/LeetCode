class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int add1=0;
        int add2=0;
        for( int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    add1++;
                    break;
                }
            }
        }
                 for( int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                    add2++;
                    break;
                }
            }
                 }
                 
        return new int[]{add1,add2};
    
    }
}