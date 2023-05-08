// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

//Run a loop from i=0 to i=arr.length+1
//First assign value as 0 for index 0 in new array
//assign the first value of arr in new array
//if i==0 updated[i]=0
//if i==1 updated[i]=arr[i]
//else updated[i]=updated[i-1]+arr[i-1]



import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Array11 {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        int[] updated =new int[arr.length+1];
        for(int i=0;i<arr.length+1;i++){
            if(i==0){
                updated[i]=0;
            
            }
            else if(i==1){
                updated[i]=arr[0];
                
            }
            else{
                updated[i]=updated[i-1]+arr[i-1];
            }
        }
        System.out.println(Arrays.stream(updated).max().getAsInt());



    }
}
