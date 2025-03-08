import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = findMin(arr,n);
        System.out.println("The min value is: "+res);
    }

    public static int findMin(int[] arr, int n){
        int start = 0;
        int end = n-1;
        int ans = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[start]<=arr[end]){
                ans = Math.min(arr[start],ans);
                break;
            }

            if(arr[start] <= arr[mid]){
                ans = Math.min(arr[start],ans);
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
