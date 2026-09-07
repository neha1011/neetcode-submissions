class Solution {
    public boolean isPalindrome(String s) {
         int n = s.length();
        for(int i=0,j=n-1;i<=j;i++,j--){
            while(i<n && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
             while(j>=0 && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
             if(i<=j){
             System.out.println(s.charAt(i));
             System.out.println(s.charAt(j));
            }
             if(i<=j){
                if((Character.isLetter(s.charAt(i)) && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) || (Character.isDigit(s.charAt(i)) && s.charAt(i) != s.charAt(j))){
                return false;
                }
            }

        }
        return true;
    }
}
