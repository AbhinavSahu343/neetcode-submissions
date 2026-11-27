class Solution {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int top = -1;
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].equals("+"))
            {
                arr[top - 1] = arr[top] + arr[top - 1];
                top--;
            }
            else if(tokens[i].equals("*"))
            {
                arr[top - 1] = arr[top] * arr[top - 1];
                top--;
            }
            else if(tokens[i].equals("-"))
            {
                arr[top - 1] = arr[top - 1] - arr[top];
                top--;
            }
            else if(tokens[i].equals("/"))
            {
                arr[top - 1] = arr[top - 1] / arr[top];
                top--;
            }
            else
            {
                top++;
                arr[top] = Integer.parseInt(tokens[i]);
            }
        }
        return arr[top];
    }
}
