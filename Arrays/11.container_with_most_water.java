class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int capacity=0;
        while(left<right){
            int height =Math.min(arr[left],arr[right]);
            int width=right-left;
            int area=height*width;
            if(area>capacity) capacity=area;
            if(arr[left]<arr[right]) left++;
            else if(arr[left]>arr[right]) right--;
            else right--;
        }
        return capacity;
    }
}