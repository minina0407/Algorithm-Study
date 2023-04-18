one two     three     four        five          six
one two     one + three one + four    three + five    four + six
two + four    two + five      three + six
​
-- 점화식
nums[i] += max(nums[i-2], nums[i-3])
​