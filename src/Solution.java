import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {

    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int n : nums) {
            hashMap.put( n, hashMap.getOrDefault(n,0) + 1);

            if(hashMap.get(n) > 1) {
                return n;
            }
        }

        return -1;
    }

}
