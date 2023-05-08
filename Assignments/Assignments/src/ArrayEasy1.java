// Input: nums = [0,2,1,5,3,4]

// Output:       [0,1,2,4,5,3]

// updated=[0,1,2,5,3,4]

// indexValue=nums[0]=0
// updated[i]=nums[indexValue]

// indexValue=nums[1]=2
// updated[i]=nums[indexValue]

// indexValue=nums[2]=1
// updated[i]=nums[1]


import java.util.ArrayList;
import java.util.Arrays;
public class ArrayEasy1 {
    public static int[] buildArray(int[] nums) {
        int indexValue;
        int[] arr=new int[nums.length];
        ArrayList<Integer> updated=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            indexValue=nums[i];
            updated.add(nums[indexValue]);
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=updated.get(i);
        }

        return arr;
    }
    public static void main(String[] args){
        int[] nums={0,2,1,5,3,4};
        int[] value=buildArray(nums);
        System.out.println(Arrays.toString(value));

    }
}