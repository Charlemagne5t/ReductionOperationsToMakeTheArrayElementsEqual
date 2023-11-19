import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int reductionOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int i = n - 1;
        while(i > 0){
            while (nums[i] == nums[i - 1]){
                i--;
                if(i == 0){
                    return count;
                }
            }
            if(nums[i] > nums[i - 1]){
                count += n - i;
            }
            i--;
        }
        return count;
    }
}
