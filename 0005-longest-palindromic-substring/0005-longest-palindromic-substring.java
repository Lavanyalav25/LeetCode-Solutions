class Solution {
    public String longestPalindrome(String s) {
        
      String sub = "";
for (int i = 0; i < s.length(); i++) {
    for (int j = i; j < s.length(); j++) {
        String str=s.substring(i,j+1);
        if (isPalindrome(str) && str.length() > sub.length()) {
                    sub = str;
                }
    }
    
}

return sub;

    }
     private boolean isPalindrome(String st) {
        int left = 0, right = st.length() - 1;
        while (left < right) {
            if (st.charAt(left) != st.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
}
}