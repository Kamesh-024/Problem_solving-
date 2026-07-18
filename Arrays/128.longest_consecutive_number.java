class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int currentstreak=1;
        int maxstreak=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                currentstreak++;
                if(currentstreak>maxstreak) maxstreak=currentstreak;
            }
            else if(arr[i]==arr[i-1]) continue;
            else{
                currentstreak=1;
            }

        }
        return maxstreak;
    }
}