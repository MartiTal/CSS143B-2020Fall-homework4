package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework

        List<List<Integer>> result = new ArrayList<>();
        permutationHelper(nums, 0, result);
        return result;
    }

    private static void permutationHelper(int[] nums, int position, List<List<Integer>> result) {

        if (nums == null || nums.length == 0) {
            List<Integer> oneResult = new ArrayList<>();
            result.add(oneResult);
            return;
        }

        if (position == nums.length-1) {
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                oneResult.add(nums[i]);
            }
            result.add(oneResult);
            return;
        }

        for (int i = position; i <= nums.length-1; i++) {
            int temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;

            permutationHelper(nums, position+1, result);

            temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;
        }


    }
}
