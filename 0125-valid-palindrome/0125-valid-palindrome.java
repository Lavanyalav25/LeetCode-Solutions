class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String str = sb.toString();

        StringBuilder sb1 = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb1.append(str.charAt(i));
        }

        return str.equals(sb1.toString());
    }
}