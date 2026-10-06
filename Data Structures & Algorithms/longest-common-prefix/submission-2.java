class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String data = strs[0];

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            for (int j = 1; j < strs.length; j++) {
             
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return data.substring(0, i);
                }
            }
        }
        return data;
    }
}
