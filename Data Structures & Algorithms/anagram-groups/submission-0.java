class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            map.putIfAbsent(temp, new ArrayList<>());
            map.get(temp).add(strs[i]);
        }

        ans.addAll(map.values());
        return ans;
    }
}
