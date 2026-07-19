class Solution {
    public int reverse(int n) {
        long rev=0;
        while(n!=0){
            int k=n%10;
            rev= rev*10 + k;
            if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) return 0;
            n/=10;
        }
        return (int)rev;
    }
}