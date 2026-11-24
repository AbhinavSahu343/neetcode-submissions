class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character,Integer> temp = new HashMap<>();

        int c = 0;

        while(c < s2.length()) {

            char ch = s2.charAt(c);
            temp.put(ch, temp.getOrDefault(ch, 0) + 1);

            if(c >= s1.length() - 1) {

                if(map.equals(temp))
                    return true;

                char left = s2.charAt(c - s1.length() + 1);

                temp.put(left, temp.get(left) - 1);

                if(temp.get(left) == 0)
                    temp.remove(left);
            }

            c++;
        }

        return false;
    }
}