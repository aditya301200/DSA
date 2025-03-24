import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = findSingle(arr,n);
        System.out.println("The single element is: "+ ans);
    }
    public static int findSingle(int[] arr, int n){
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if((arr[mid] != arr[mid + 1]) && (arr[mid] != arr[mid - 1])){
                return arr[mid];
            }
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
