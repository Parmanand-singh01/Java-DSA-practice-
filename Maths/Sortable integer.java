
import java.util.*;

class Solution {
    public int sortableIntegers(int[] nums) {
        int sum = 0;
        int n = nums.length;

        int[] arr = Arrays.copyOf(nums, n);
        Arrays.sort(nums);

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            boolean fact = true;

            for (int j = 0; j < n; j += k) {
                int[] brr = Arrays.copyOfRange(arr, j, j + k);
                int[] crr = Arrays.copyOfRange(nums, j, j + k);

                if (!valid(brr, crr)) {
                    fact = false;
                    break;
                }
            }

            if (fact) {
                sum += k;
            }
        }

        return sum;
    }

    boolean valid(int[] brr, int[] crr) {
        int[] temp = Arrays.copyOf(brr, brr.length);
        Arrays.sort(temp);

        if (!Arrays.equals(temp, crr)) {
            return false;
        }

        int count = 0;
        int n = brr.length;

        for (int i = 0; i < n; i++) {
            if (brr[i] > brr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
