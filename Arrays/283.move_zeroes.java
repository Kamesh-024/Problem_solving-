class Solution {
    public void moveZeroes(int[] arr) {
        int l=0, r =1;
        while(r<arr.length){
            if(arr[l]==0 && arr[r]!=0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r++;
            }
            else if(arr[l]==0 && arr[r]==0) r++;
            else{
                l++;
                r++;
            }
        }
    }
}