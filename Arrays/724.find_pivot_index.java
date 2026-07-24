class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i] =prefix[i-1]+ nums[i];
        }

        int total=prefix[prefix.length-1];
        for(int i=0;i<nums.length;i++){
            int lsum;
            int rsum;

            if(i==0) lsum=0;
            else lsum=prefix[i-1];

            rsum=total-prefix[i];

            if(lsum==rsum) return i;
        }
        return -1;
    }
}