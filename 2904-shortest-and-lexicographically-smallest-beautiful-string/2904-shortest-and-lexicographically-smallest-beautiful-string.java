class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int left = 0;
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        String answer = "";

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            // If we have more than k ones, move left
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            // Exactly k ones
            if (ones == k) {

                // Remove unnecessary leading zeros
                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = right - left + 1;
                String current = s.substring(left, right + 1);

                if (len < minLen ||
                    (len == minLen && current.compareTo(answer) < 0)) {

                    minLen = len;
                    answer = current;
                }
            }
        }

        return answer;
    }
}