class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                if(ch>='A' && ch<='Z'){
                    ch=(char)('a'+ch-'A');
                }
                sb.append(ch);
            }
                
        }
        int left=0,right=sb.length()-1;
            while(left<right){
                if(sb.charAt(left)!=sb.charAt(right)){
                    return false;

                }
                    left++;
                    right--;
            }
            return true;       
    }
}