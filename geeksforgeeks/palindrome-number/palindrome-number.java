class Solution {
    public boolean isPalindrome(int n) {

        // n = Math.abs(n);

        // int sum = n;
        // int rev = 0;
        // while(n>0){
        //     int d=n%10;
        //     rev=rev*10+d;
        //     n=n/10;
        // }
        //  return (rev==sum);
        
        
        n=Math.abs(n);
        int rev=0;
        int sum=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return (rev==sum);
       
    }
}