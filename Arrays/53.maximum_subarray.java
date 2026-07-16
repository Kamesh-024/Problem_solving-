class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0, gsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>gsum) gsum=sum;
            if(sum<0) sum=0;
        }
        return gsum;
    }
}