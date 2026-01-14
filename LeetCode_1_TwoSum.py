class LeetCode_1_TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        for index, value in enumerate(nums):
            target2 = target - value
            if(target2 in num_map and num_map[target2] != index):
                return [index, num_map[target2]]
            num_map[value] = index
        
        return []
