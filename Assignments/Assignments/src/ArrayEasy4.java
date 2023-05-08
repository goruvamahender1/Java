// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.

//if currSum>max:
// max=currSum

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int prevSum=0;
        int currSum;
        for(int i=0;i<accounts.length;i++){
            currSum=0;
            for(int j=0;j<accounts[i].length;j++){
                currSum=currSum+accounts[i][j];
            }
            if(currSum>max){
                max=currSum;
            }

        }
        return max;
    }
}
