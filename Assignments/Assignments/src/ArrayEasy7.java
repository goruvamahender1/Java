//Run a loop from i to nums.length
// start j from i+1 
// check for nums[i]==nums[j] if so increase the count



class ArrayEasy7 {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count=numIdenticalPairs(nums);
        System.out.println(count);
    }
}
