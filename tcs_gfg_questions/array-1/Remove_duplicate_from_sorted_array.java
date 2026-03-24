// You are given a sorted array arr[] containing positive integers. Your task
//  is to remove all duplicate elements from this array such that each element 
// appears only once. Return an array containing these distinct elements in the 
// same order as they appeared.
// Examples :

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: After removing all the duplicates
//  only one instance of 2 will remain i.e. [2] so modified array 
// will contains 2 at first position and you should return array containing
//  [2] after modifying the array.
// Input: arr[] = [1, 2, 4]
// Output: [1, 2, 4]
// Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
import java.util.*;
public class Remove_duplicate_from_sorted_array{
    public static void main(String[] args){

    Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
                // if(n==0) return;

                // int i=0;
                // for(int j=1;j<n;j++){
                //     if(arr[j] != arr[i]){
                //         i++;
                //         arr[i]=arr[j];
                //     }
                // }
                // for(int y=0;y<=i;y++){
                //     System.out.print(arr[y]+" ");
                // }
            // {1,2,1,2} ={1,2}
            if(n==0){
                return;
            }
            int i=0;
            for(int j=1;j<n;j++){
                if(arr[j] != arr[i]){
                    i++;
                    arr[i] =arr[j];
                }
            }
            for(int s=0;s<=i;s++){
                System.out.print(arr[s]+" ");
            }
    }
}