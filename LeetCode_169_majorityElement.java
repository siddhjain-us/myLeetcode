import java.util.*;
class LeetCode_169_majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numOcc = new HashMap<>();
        for(int i : nums){
            if(numOcc.containsKey(i)){
                numOcc.put(i, numOcc.get(i) + 1);
            }
            else{
                numOcc.put(i, 1);
            }
        }
        int max = 0;
        int occ2 = 0;
        for(int num : numOcc.keySet()){
            if(occ2 < numOcc.get(num)){
                occ2 = numOcc.get(num);
                max = num;
            }
        }
        return max;
    }
}