
from typing import List


class LeetCode_26_removeDuplicatesFromSortedArray:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = 1
        while(fast < len(nums)):
            if(nums[slow] != nums[fast]):
                slow = slow + 1
                nums[slow] = nums[fast]
            else:
                fast = fast+1
        return slow + 1