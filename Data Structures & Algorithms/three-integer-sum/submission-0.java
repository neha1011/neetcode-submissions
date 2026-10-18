class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                Arrays.sort(nums);
        int n = nums.length;
       List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
           if(i>0 && nums[i]==nums[i-1])
           continue; 
           int first = nums[i];
           int complement = first * -1;
           int j=i+1,k=n-1;
           while(j<k){
            if(nums[j]+nums[k]==complement){
                int second = nums[j];
                int third = nums[k];
                result.add(List.of(first,second,third));
                j++;
                k--;
                while(j<n && nums[j]==nums[j-1])j++;
                while(k>0 && nums[k]==nums[k+1])k--;
            }
            else if(nums[j]+nums[k]<complement){
                j++;
            }else{
                k--;
            }
           }

        }
        return result;
    }
}
