// Input: arr[] = [1, 8, 7, 56, 90]
// Output: 90
// Explanation: The largest element of the given array is 90.
// Input: arr[] = [5, 5, 5, 5]
// Output: 5
// Explanation: The largest element of the given array is 5.
// Input: arr[] = [10]
// Output: 10
// Explanation: There is only one element which is the largest.
import java.util.*;
public class tryThree {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int temp =-1;
    for (int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        if(arr[i] > temp){
            temp =arr[i];
        }
    }
    System.out.print(temp);

 }   
}
