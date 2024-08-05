class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer>inter=new ArrayList<>();
    int x=0,y=0;
    while(x<nums1.length && y<nums2.length){
        if(nums1[x]<nums2[y]){
            x++;
        }
        else if(nums1[x]>nums2[y]){
            y++;
        }
        else{
            inter.add(nums1[x]);
            x++;
            y++;
        }
    }
    int result[]=new int[inter.size()];
    for(int i=0;i<inter.size();i++){
        result[i]=inter.get(i);
    }
    return result;
    }
}