class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int m = intervals.length;
        int[][] result = new int[m+1][2];
        List<int[]> res  = new ArrayList<>();
        for(int i=0;i<m;i++){
           if(newInterval[1]<intervals[i][0]){
            res.add(newInterval);
            newInterval = intervals[i];
           }
           else if(newInterval[0]>intervals[i][1]){
            res.add(intervals[i]);
           }else{
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
           }
        }
        res.add(newInterval);
        return res.toArray(int[][]::new);
    }
}
