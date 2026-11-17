class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(int i = 0; i < strs.size(); i++)
        {
            String temp = strs.get(i);
            encoded_string +=  temp.length() + "#" + temp;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        String temp = "";
        String len = "";
        int length = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != '#')
            len += str.charAt(i);
            else
            {
                length = Integer.parseInt(len);
                for(int j = i + 1; j < i + length + 1; j++)
                {
                    temp += str.charAt(j);
                }
                decoded_string.add(temp);
                i = i + length;
                temp = "";
                len = "";
                length = 0;
                
            }
            
        }
        return decoded_string;

        
    }
}
