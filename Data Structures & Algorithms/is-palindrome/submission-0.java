class Solution {
    public boolean isPalindrome(String s) {
        String data = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(data).reverse().toString();
        return data.equals(reversedString);
        
    }
}
