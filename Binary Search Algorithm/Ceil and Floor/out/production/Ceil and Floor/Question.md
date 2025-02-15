# Question - GFG

Given an unsorted array `arr[]` of integers and an integer `x`, find the floor and ceiling of `x` in `arr[]`.

> `Floor` of `x` is the largest element which is smaller than or equal to `x`. `Floor` of `x` doesn’t exist if `x` is smaller than the smallest element of `arr[]`. 

> `Ceil` of `x` is the smallest element which i``s greater than or equal to `x`. Ceil of x doesn’t exist if `x` is greater than the greatest element of `arr[]`.

Return an array of integers denoting the `[floor, ceil]`. Return `-1` for floor or ceiling if the floor or ceiling is not present.

### Example- 1:

> **Input**: `x = 0` , `arr[] = [1, 2, 8, 10, 11, 12, 19]`  
**Output**: `-1, 1`  
**Explanation**: Floor of 0 is -1 and ceil of 0 is 1.

### Example- 2:

>**Input**: `x = 9` , `arr[] = [1, 2, 8, 10, 11, 12, 19]`  
**Output**: `8, 10`  
**Explanation**: Floor of 9 is 8 but ceil of 9 is 10.

**Expected Time Complexity:** `O(logn)`  
**Expected Auxiliary Space:** `O(1)`

## Constraints :
`1 ≤ arr.size ≤ 105`  
`1 ≤ arr[i], x ≤ 106`