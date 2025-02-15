import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // taking arr input
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int floor = Floor(arr, x);
        int ceil = Ceil(arr, x);

        System.out.println(floor + " " + ceil);
    }

    public static int Floor(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;

        if(x < arr[start]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(x == arr[mid]){
                return mid;
            } else if(x > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[end];
    }

    public static int Ceil(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;

        if(x > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            if(x == arr[mid]){
                return mid;
            } else if(x > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}
