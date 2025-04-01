import java.util.Arrays;

class Solution {

   public static int singleNumber(int[] nums) {
       // We can solved this using  XOR ^
       int res = 0;
       for(int n : nums ) {
           res = res ^ n;
       }
       return res;
   }


}
