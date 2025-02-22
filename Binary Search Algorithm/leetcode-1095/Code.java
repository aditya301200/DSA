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

        int peak = findPeak(arr,n-1);
        int leftIdx = findLeftIdx(arr,0,peak,target);
        if(leftIdx != -1){
            System.out.println(leftIdx);
        }else{
            System.out.println(findRightIdx(arr,peak+1,n-1,target));
        }
    }
    public static int findLeftIdx(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start+(end-start)/2;
            int midval = arr[mid];
            if(target == midval){
                return mid;
            }else if(target > midval){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int findRightIdx(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start+(end-start)/2;
            int midval = arr[mid];
            if(target == midval){
                return mid;
            }else if(target > midval){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int findPeak(int[] arr, int n){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            } else if(arr[mid] > arr[mid+1]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
