// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//Create an arraylist 
//run a loop from i=0 to i<n
//append the nums[i] and nums[i+n]
//Initialize a new array of size nums.length and insert the element into the array 
//return the new array


import java.util.ArrayList;
import java.util.Arrays;

class ArrayEasy5 {
    public static int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
            l.add(nums[i+n]);
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=(int) nums.length/2;
        int[] arr=shuffle(nums,n);
        System.out.println(Arrays.toString(arr));
    }
}
