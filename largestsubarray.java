import java.util.HashMap;

public class LargestSubarray {
    public int zeroSumLargestSubarray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        // prefixSum, index

        int maxLen = 0, prefSum = 0;
        mp.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            if (mp.containsKey(prefSum)) {
                maxLen = Math.max(maxLen, i - mp.get(prefSum));
            } else {
                mp.put(prefSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LargestSubarray obj = new LargestSubarray();
        int[] arr = {1, 2, -3, 3, 1, -4, 2, -2};
        int n = arr.length;

        int result = obj.zeroSumLargestSubarray(arr, n);
        System.out.println("Length of the largest subarray with zero sum: " + result);
    }
}
