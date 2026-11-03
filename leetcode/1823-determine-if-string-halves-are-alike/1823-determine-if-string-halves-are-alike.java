class Solution {


    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {
        
        int mid=s.length()/2;
        int n=s.length();

        int i=0;
        int j=mid;

        int v1=0;
        int v2=0;
        while(i<mid && j<n){
           if(isVowel(s.charAt(i))){
            v1++;
           }
           if(isVowel(s.charAt(j))){
            v2++;
           }
           i++;
           j++;
        }

        return v1==v2;
    }
}