class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque();
        for (String s : tokens) {
            if (Character.isDigit(s.charAt(0)) || s.length() > 1) {
                stack.push(Integer.parseInt(s));
            } else {
                int val = 0;
                int b = stack.pop(); int a = stack.pop();
                if (s.equals("+")) val = a + b;
                else if (s.equals("-")) val = a - b;
                else if (s.equals("*")) val = a * b;
                else val = a / b;
                stack.push(val);
            }
        }
        return stack.pop();
    }
}
