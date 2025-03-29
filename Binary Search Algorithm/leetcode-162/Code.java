import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res = findPeak(arr,n);
        System.out.println("Index of peak element is: "+res);
    }
    public static int findPeak(int[] arr, int n){
        int start = 0;
        int end=n-1;
        if(n==1){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
