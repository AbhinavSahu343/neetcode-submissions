class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int required = 0;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++)
        {
            int l = i + 1;
            int r = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1])
            continue;
            
            required = -1 * nums[i];
            while(l < r)
            {
                if(nums[l] + nums[r] == required)
                {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[l]);
                    inner.add(nums[r]);
                    ans.add(inner);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                    l++;
                    while (l < r && nums[r] == nums[r + 1])
                    r--;

                }   
                else if(nums[l] + nums[r] > required)
                r--;
                else
                l++;
            }
                     
        }
        return ans;
    }
}
