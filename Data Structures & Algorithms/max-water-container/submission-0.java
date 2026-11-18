class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r)
        {
            int cur = (r - l) * Math.min(height[r] , height[l]);
            max = Math.max(cur , max);
            if(height[l] < height[r])
            l++;
            else
            r--;
        }
        return max;

    }
}