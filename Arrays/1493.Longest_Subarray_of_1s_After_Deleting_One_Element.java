class Solution {
    public int longestSubarray(int[] arr) {

        int start = 0;      // Left boundary of the sliding window
        int max_ones = 0;   // Stores the maximum answer
        int zeroes = 0;     // Number of zeroes inside the current window

        // Expand the window
        for (int end = 0; end < arr.length; end++) {

            // If a zero enters the window, increment zero count
            if (arr[end] == 0)
                zeroes++;

            // Shrink the window until it contains at most one zero
            while (zeroes > 1) {

                // If the element leaving is a zero,
                // decrease the zero count
                if (arr[start] == 0)
                    zeroes--;

                // Move the left boundary forward
                start++;
            }

            // Current window has at most one zero.
            // Since the problem requires deleting one element,
            // answer = window length - 1
            //
            // Window length = end - start + 1
            // After deleting one element:
            // (end - start + 1) - 1 = end - start
            max_ones = Math.max(max_ones, end - start);
        }

        return max_ones;
    }
}