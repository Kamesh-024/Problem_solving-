class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(arr.length==1) return 0;
        int low=0,high=0,prod=1,count=0;
        while(high<arr.length){
            prod*=arr[high];
            high++;
            while(prod>=k){
                prod/=arr[low];
                low++;
            }
            count+=high-low;
        }
        return count;
    }
}