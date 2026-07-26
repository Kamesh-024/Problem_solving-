class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        } int max=sum;
        int start=0;
        int end=k;
        while(end<arr.length){
            sum-=arr[start];
            start++;

            sum+=arr[end];
            end++;

            max=Math.max(sum,max);
        }
        return (double) max/k;
    }
}