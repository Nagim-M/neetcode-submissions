class Solution {
    private List<String> pList;
    private int n;

    public List<String> generateParenthesis(int n) {
       this.n = n;
       pList = new ArrayList<>(); 
       backTrack(0, 0, new StringBuilder());
       return pList;
    }

    public void backTrack(int openCount, int closeCount, StringBuilder sb) {
        if (openCount + closeCount == 2 * n) {
            pList.add(sb.toString());
            return;
        }

        if (openCount < n) {
            sb.append("(");
            backTrack(openCount + 1, closeCount, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (closeCount < openCount) {
            sb.append(")");
            backTrack(openCount, closeCount + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
