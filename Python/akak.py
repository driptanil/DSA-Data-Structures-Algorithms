
def splitArray(nums,m):
    l = max(nums) 
    r = sum(nums)
    ans = r
    while l < r:
        mid = (l+r)//2
        sumUp = 0
        count = 1
        for n in nums:
            if sumUp+n > mid:
                count+=1
                sumUp=n
            else:
                sumUp+=n
                
        if count <= m:
            ans = min(ans, mid)
            r = mid
        else:
            l = mid+1     
    return ans
    
arr = [1, 4, 4]
print(splitArray(arr, 2))
