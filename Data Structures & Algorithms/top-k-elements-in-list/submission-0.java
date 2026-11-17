class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        Hashtable<Integer, Integer> map = new Hashtable<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i] , map.get(arr[i]) + 1);
            else
            map.put(arr[i] , 1);
        }
        int c = 0;
        for(int i = 0; i < k; i++){
        int max = Integer.MIN_VALUE;
        int maxKey = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        ans[c] = maxKey;
        c++;
        map.put(maxKey , -1);
        }
        return ans;
    }
}
