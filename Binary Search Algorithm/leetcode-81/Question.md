# Question - Leetcode-81 - Search in Rotated Sorted Array II

There is an integer array `nums` sorted in non-decreasing order (not necessarily with _**distinct**_ values).

Before being passed to your function, `nums` is **_rotated_** at an unknown pivot index `k` `(0 <= k < nums.length)` such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` **_(0-indexed)_**. For example, `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index `5` and become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums` _**after**_ the rotation and an integer `target`, return `true` if `target` is in `nums`, or `false` if it is not in `nums`.

You must decrease the overall operation steps as much as possible.

### Example 1:

**_Input_**: nums = [2,5,6,0,0,1,2], target = 0  
**_Output_**: true
### Example 2:

**_Input_**: nums = [2,5,6,0,0,1,2], target = 3  
**_Output_**: false


### Constraints:

> - `1 <= nums.length <= 5000`
> - `-104 <= nums[i] <= 104`
> - `nums` **_is guaranteed to be rotated at some pivot._**
> - `-104 <= target <= 104`