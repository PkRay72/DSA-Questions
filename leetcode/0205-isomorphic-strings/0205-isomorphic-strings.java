class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] lastSeen=new int[512];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(lastSeen[c1]!=lastSeen[c2+256]){
                return false;
            }
            lastSeen[c1]=i+1;
            lastSeen[c2+256]=i+1;
        }
        return true;
    }
}