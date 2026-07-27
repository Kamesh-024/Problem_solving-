class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min_window=Integer.MAX_VALUE;
        int sum=0, low=0, high=0;

        while(high<arr.length){
            sum+=arr[high];
            high++;

            while(sum>=target){
                int curr_window=high-low;
                min_window=Math.min(curr_window,min_window);
                sum-=arr[low];
                low++;
            }
        }
        return min_window==Integer.MAX_VALUE ? 0 : min_window ;
    }
}