class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        dict={}
        i=0
        while i<len(nums):
            dict[nums[i]]=dict.get(nums[i],0)+1
            if dict[nums[i]]>2:
                nums.pop(i)
            else:
                i+=1
        return len(nums)