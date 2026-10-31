class Solution {
    public String toUpper(String s) {
        // code here
        
      //  return s.toUpperCase();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append((char)('A'+ch-'a'));
        }
        return sb.toString();
    }
}