class LeetCode_26_removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 1){
            return 1;
        }
        int pointer1 = 0, pointer2 = 1;
        while(pointer2 < nums.length){
            if(nums[pointer1] == nums[pointer2]){
                // ++pointer1;
                ++pointer2;
            }

            else{
                ++pointer1;
                nums[pointer1] = nums[pointer2];
            }
        }
        return pointer1 + 1;

    }
}