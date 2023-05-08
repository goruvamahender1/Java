// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

//we want candies[i] to be the greatest of all other candies, after adding the extra candies to the candies[i]
// for candies[0]=2+3=5, which is greatest among all other candies like 3,5,1,3; value=true;
//for candies[1]=3+3=6, which is greatest among all other candies like 2,5,1,3; value=true;
//for candies[2]=5+3=8, which is greatest among all other candies like 2,3,1,3 ; value=true;
//for candies[3]=1+3=4, which is not greatest among all other candies like 2,3,5,3; value=false;
//for candies[4]=2+3=5, which is greatest among all other candies like 2,3,5,1; value=true;

//so a run a upper loop from i=0 to i=candies.length and calculate=candies[i]+extraCandies;
//run a lower loop j=0 to j=candies.length if i==j skip index, else if calculate<candies[j] value=false and break and 
//after every completion of lower loop iteration we want to value=true 

import java.util.*;


class ArrayEasy6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int currSum;
        boolean value=true;
        int currIndex;
        for(int i=0;i<candies.length;i++){
            currIndex=i;
            currSum=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(currIndex==j){
                    continue;
                }
                if(currSum<candies[j]){
                    value=false;
                    l.add(value);
                    break;
                }
            }
            if(value){
                l.add(value);
            }
            value=true;
        }
        return l;
    }
}