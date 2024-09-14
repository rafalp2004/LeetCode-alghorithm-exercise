import java.util.HashSet;

public class ContainsDuplicateII {
    public static void main(String[] args) {
       System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); //true
        System.out.println("2---------------------------------");
      System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); //false
        System.out.println("3---------------------------------");
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1)); //true

 
    }
//   My first slower solution
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        int firstIndex = 0;
//        int secondIndex = 1;
//        while (secondIndex!=nums.length) {
//            if (nums[firstIndex] == nums[secondIndex] && secondIndex - firstIndex  <= k) {
//                return true;
//            }
//            if(firstIndex==nums.length-2 && secondIndex==nums.length-1){
//                break;
//            }
//            if (secondIndex - firstIndex  == k || secondIndex == nums.length-1) {
//                firstIndex++;
//                secondIndex = firstIndex + 1;
//            } else if (secondIndex < nums.length - 1) {
//                secondIndex++;
//            }
//        }
//        return false;
//    }

    public static boolean  containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            // Jeśli rozmiar zbioru przekroczy k, usuwamy najstarszy element
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}
