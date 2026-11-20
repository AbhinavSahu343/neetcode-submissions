class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0)
        return 0;
        int l = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++)
        {
                if(nums[i] == nums[i-1])
                continue;
                else if(nums[i] == nums[i-1] + 1)
                l++;
                else
                {
                    max = Math.max(l,max);
                    l = 1;
                }
                max = Math.max(l,max);
        }
        return max;

    }
}
