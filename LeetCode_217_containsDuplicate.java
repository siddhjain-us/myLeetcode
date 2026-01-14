import java.util.*;
class LeetCode_217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(numbers.contains(nums[i]))
                return true;
            else
                numbers.add(nums[i]);
        }
        return false;
    }
    
}