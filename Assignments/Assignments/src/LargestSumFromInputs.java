
import java.util.Scanner;
public class LargestSumFromInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=1;
        int maxValue=Integer.MIN_VALUE;
        while(input!=0){
            input=sc.nextInt();
            if(input>maxValue){
                maxValue=input;
            }

        }    
        System.out.println(maxValue); 
    }
}
