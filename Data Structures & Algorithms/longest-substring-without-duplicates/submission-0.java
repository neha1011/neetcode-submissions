class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int res=0;
        int start = 0;
        int end=0;
        for(int i=0;i<n;i++){
           if(!set.contains(s.charAt(i))){
              set.add(s.charAt(i));
              end=i;
           }else{
             while(s.charAt(start) != s.charAt(i)){
                set.remove(s.charAt(start));
                start++;
             }
             start++;
             end = start;
           }
           res = Math.max(res,set.size());
        }
        return res;
    }
}
