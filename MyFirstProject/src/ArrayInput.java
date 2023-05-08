import java.util.Arrays;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        // 1 2 3
        // 4 5
        // 6 7 7 9
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] k:arr){
            System.out.println(Arrays.toString(k));
        }
    }
}
