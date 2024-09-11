public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    break;
                }
            }
        }
        return array;
    }
}

