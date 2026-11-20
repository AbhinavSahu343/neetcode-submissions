class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
            set.add(num);

        int length = 0;
        int max = 0;

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                length = 0;

                while(set.contains(num + length))
                    length++;

                max = Math.max(length, max);
            }
        }

        return max;
    }
}