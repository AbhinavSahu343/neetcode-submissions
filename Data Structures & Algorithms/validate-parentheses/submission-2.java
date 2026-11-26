class Solution {
    public boolean isValid(String s) {
        char arr[] = new char[s.length()];
        int top = -1;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                top++;
                arr[top] = s.charAt(i);
            }
            else if(top == -1)
            return false;
            else if(s.charAt(i) == ')' && arr[top] != '(')
            return false;
            else if(s.charAt(i) == '}' && arr[top] != '{')
            return false;
            else if(s.charAt(i) == ']' && arr[top] != '[')
            return false;
            else
            top--;
        }
        if(top != -1)
        return false;
        return true;
    }
}
