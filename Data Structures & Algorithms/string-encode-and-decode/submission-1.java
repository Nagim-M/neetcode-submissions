class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        StringBuilder lenBuilder = new StringBuilder();
        List<String> strings = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == '#') {
                int len = Integer.parseInt(lenBuilder.toString());
                lenBuilder = new StringBuilder();
                i++;
                strings.add(str.substring(i, i + len));
                i += len;
            } else {
                lenBuilder.append(str.charAt(i++));
            }
        }
        return strings;
    }
}
