import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};

        // value, index
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];

            if (mp.containsKey(partner)) {
                ans = new int[]{i, mp.get(partner)};
                return ans;
            }

            mp.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
