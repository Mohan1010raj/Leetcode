class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        count=1
        maxe=1
        for i in range(len(nums)-1):
            if nums[i]<nums[i+1]:
                count+=1
            else:
                maxe=max(count,maxe)
                count=1
        return max(maxe,count)