import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);
        char res = findSmallestLetter(arr, target, n);
        System.out.println("The smallest character is: "+res);
    }

    public static char findSmallestLetter(char[] arr, char target, int n){
        int start = 0;
        int end = n-1;
        if(target >= arr[end]) return arr[start];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[start] > target){
                return arr[start];
            } else if (arr[mid] <= target) {
                start = mid + 1;
            } else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}
