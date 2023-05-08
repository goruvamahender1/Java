// Input: m = 2, n = 3, indices = [[0,1],[1,1]]
// Output: 6
// Explanation: Initial matrix = [[0,0,0],[0,0,0]].
// After applying first increment it becomes [[1,2,1],[0,1,0]].
// The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

//First initialize a final matrix with size of mxn
//Now take the index of from indices 











import java.util.*;
public class Array13 {
    public static int indices(int[][] indices){
        for(int[] r1:indices){
            for(int c1:r1){
                return c1;
            }
        }
        return 0;
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] final_matrix=new int[m][n];
        for(int i=0;i<final_matrix.length;i++){
            for(int j=0;j<final_matrix[i].length;j++){
                int value=indices(indices);
                if(j%2==0){
                    for(int k=0;k<m;k++){
                        final_matrix[value][k]+=1;
                    }
                }
                else{
                    for(int z=0;z<m;z++){
                        final_matrix[z][value]+=1;
                    }
                }
            }
        }
        int odd=0;
        for (int[] is : final_matrix) {
            System.out.println(Arrays.toString(is));
            for(int value : is) {
                
                if(!(value%2==0)){
                    odd+=1;
                }
                
            }
            
        }
        return odd;
        
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices={{0,1},{1,1}};
        int g=oddCells(m,n,indices);
        System.out.println(g);
        

    }
}
