class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
            
            if (c == '(') stack.push(')');
            if (c == '{') stack.push('}');
            if (c == '[') stack.push(']');
        }
        return stack.isEmpty();
    }
}