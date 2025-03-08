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

        System.out.println(search(arr,target));
    }
    public static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                start++;
                end--;
                continue;
            }
            // left sorted
            if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target <= arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
            // right sorted
            else{
                if(arr[mid]<=target && target <= arr[end]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
