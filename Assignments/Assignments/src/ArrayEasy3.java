// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// l=[]

// run a loop from i to length
// if index==0:
//   l.append(nums[i])
// else:
//   curr_index=i 
//   int sum=0
//   while(curr_index>=0):
//       sum=sum+nums[curr_index]
//       curr_index--;
//   l.append(sum)



import java.util.ArrayList;
import java.util.Arrays;

class ArrayEasy3 {
    public static int[] runningSum(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        int currIndex;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(i==0){
                l.add(nums[i]);
            }
            else{
                currIndex=i;
                while(currIndex>=0){
                    sum=sum+nums[currIndex];
                    currIndex--;

                }
                l.add(sum);
                
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=l.get(i);
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] updated=runningSum(nums);
        System.out.println(Arrays.toString(updated));

    }
}
