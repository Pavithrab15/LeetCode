class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                merged.add(currentInterval);
                currentInterval = interval;
            }
        }
        
        merged.add(currentInterval);
        
        return merged.toArray(new int[merged.size()][]);
    }
}