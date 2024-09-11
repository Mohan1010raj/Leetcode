class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n=int("".join(map(str,digits)))
        s=n+1
        li = [int(sachin) for sachin in str(s) ]
        return li
        