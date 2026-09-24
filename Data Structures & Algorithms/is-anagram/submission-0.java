class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        t = new String(arr2);

        if(s.equals(t))
        return true;
        else 
        return false;


    }
}
