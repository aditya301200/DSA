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

        int res = searchInRotatedSortedArray(arr,target,n);
        System.out.println("Index of the target is: "+res);
    }

    public static int searchInRotatedSortedArray(int[] arr, int target, int n){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return mid;
            if(arr[mid] >= arr[start]){
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
