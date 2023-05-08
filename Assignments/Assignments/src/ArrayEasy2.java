//Form an array that is the double the size of original array
// run a loop from i to n insert the elemente each time
//int double=nums.length*2;
//int[] updated=new int[double]
//

import java.util.ArrayList;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(nums[i]);
            l.add(nums[i+n]);
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}