//Before that right shift the value until the indexValue from j=n-1 to j>index;
//Get the index value replace the target Array[indexValue] with nums[i]


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>index[i];j--){
                targetArray[j]=targetArray[j-1];
            }
            targetArray[index[i]]=nums[i];
        }
        return targetArray;
        
    }
}