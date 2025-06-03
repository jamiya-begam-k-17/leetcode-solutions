import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        // Sample input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create object of Solution class to call twoSum()
        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(nums, target);

        // Print the result
        System.out.println("Indexes: " + Arrays.toString(result));
    }
}
