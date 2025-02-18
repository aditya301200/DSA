import java.util.ArrayList;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int res1 = leftOccurrence(arr,target,n);
        int res2 = rightOccurrence(arr,target,n);
        System.out.println("["+res1+", "+res2+"]");
    }

    public static int leftOccurrence(int[] arr, int target, int n){
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                ans = mid;
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static int rightOccurrence(int[] arr, int target, int n){
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                ans = mid;
                start = mid+1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
