import java.util.Arrays;

class Solution {

    public static int[] plusOne(int[] nums) {

        for(int i = nums.length-1; i >= 0; i--) {
//            System.out.println(nums[i]);
            if(nums[i] < 9) {
                nums[i]++; // add one every digit
                System.out.println(nums[i]);
                return nums;
            }
            nums[i] = 0;
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }


}
