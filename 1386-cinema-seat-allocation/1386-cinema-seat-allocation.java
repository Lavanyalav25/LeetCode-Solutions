import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

      
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int s = seat[1];

            map.put(row, map.getOrDefault(row, 0) | (1 << s));
        }

        int result = (n - map.size()) * 2;

        for (int mask : map.values()) {

            boolean left = (mask & (1 << 2)) == 0 &&
                           (mask & (1 << 3)) == 0 &&
                           (mask & (1 << 4)) == 0 &&
                           (mask & (1 << 5)) == 0;

            boolean right = (mask & (1 << 6)) == 0 &&
                            (mask & (1 << 7)) == 0 &&
                            (mask & (1 << 8)) == 0 &&
                            (mask & (1 << 9)) == 0;

            boolean middle = (mask & (1 << 4)) == 0 &&
                             (mask & (1 << 5)) == 0 &&
                             (mask & (1 << 6)) == 0 &&
                             (mask & (1 << 7)) == 0;

            if (left && right) {
                result += 2;
            } else if (left || middle || right) {
                result += 1;
            }
        }

        return result;
    }
}