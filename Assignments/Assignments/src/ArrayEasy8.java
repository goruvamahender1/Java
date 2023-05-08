//Run the upper loop from i=0 to i=nums.length and assign count=0;
//Run the lower loop from j=0 t0 j=nums.length
//if i==j continue
//if nums[j]<nums[i], do count+=1
//Add the count to new array

import java.util.ArrayList;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int[] arr=new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]<nums[i]){
                    count+=1;

                }
            }
            l.add(count);

        }
        for(int k=0;k<nums.length;k++){
            arr[k]=l.get(k);
        }
        
        return arr;
        
    }
}