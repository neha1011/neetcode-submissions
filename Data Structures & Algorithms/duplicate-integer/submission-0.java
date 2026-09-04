class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length > s.size();
    }
}