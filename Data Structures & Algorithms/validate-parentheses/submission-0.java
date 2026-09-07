class Solution {
    public boolean isValid(String s) {
         Map<Character,Character> map = new HashMap<Character,Character>();
      map.put(')','(');
      map.put('}','{');
      map.put(']','[');
      Stack<Character>stk = new Stack<Character>();
      for(int i=0;i<s.length();i++){
        if(map.containsValue(s.charAt(i))){ stk.push(s.charAt(i));}
        else{
           if(!stk.empty() && stk.peek() == map.get(s.charAt(i))) stk.pop();
           else return false;
        }
      }
      if(stk.size() == 0)
      return true;
      return false;
        
    }
}
