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
        int res = findPosition(arr,target,n);
        System.out.println("Insert position is: " + res);
    }

    public static int findPosition(int[] arr, int target, int n){
        int start = 0;
        int end = n-1;
        if(target > arr[end]) return n;
        if(target < arr[start]) return 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
