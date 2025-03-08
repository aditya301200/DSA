# Question - Leetcode-153 - Find Minimum in Rotated Sorted Array

Suppose an array of length `n` sorted in ascending order is **_rotated_** between `1` and `n` times. For example, the array `nums = [0,1,2,4,5,6,7]` might become:

- `[4,5,6,7,0,1,2]` if it was rotated `4` times.
- `[0,1,2,4,5,6,7]` if it was rotated `7` times.
Notice that **_rotating_** an array `[a[0], a[1], a[2], ..., a[n-1]]` 1 time results in the array `[a[n-1], a[0], a[1], a[2], ..., a[n-2]]`.

Given the sorted rotated array `nums` of **_unique_** elements, return the _**minimum element of this array**_.

You must write an algorithm that runs in `O(log n)` time.


### Example 1:

> **_Input_**: nums = [3,4,5,1,2]  
**_Output_**: 1  
**_Explanation_**: The original array was [1,2,3,4,5] rotated 3 times.
### Example 2:

> **_Input_**: nums = [4,5,6,7,0,1,2]  
**_Output_**: 0  
**_Explanation_**: The original array was [0,1,2,4,5,6,7], and it was rotated 4 times.
### Example 3:

> **_Input_**: nums = [11,13,15,17]  
**_Output_**: 11  
**_Explanation_**: The original array was [11,13,15,17], and it was rotated 4 times.


### Constraints:

> - `n == nums.length`
> - `1 <= n <= 5000`
> - `-5000 <= nums[i] <= 5000`
> - All the integers of `nums` are **_unique_**.
> - `nums` is sorted and rotated between `1` and `n` times.