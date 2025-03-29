import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        int ans = splitArray(arr,m);
        System.out.println("Ans: "+ans);
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        while(start < end){
            // try for the mid as potential answer
            int mid = start+(end-start)/2;
            // calculate how many pieces it can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // I can't add this in this subarray. Make new one.
                    // say i add this num in new subarray, then sum = num.
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid+1;
            } else{
                end = mid;
            }
        }
        return end; // here start == end;
    }
}
