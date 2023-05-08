// run a loop b/w low and high
//take the number pass it to counter to calculate length
//take another function which will calculate sum of each digit

import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            int num=i;
            
            int length=digitCount(i);
            int totalSum=valueSum(i,length);
            if(totalSum==num){
                System.out.println(num+ " ");
            }
        }
        
    }
    public static int digitCount(int value){
        int count=0;
        while(value>0){
            value/=10;
            count++;
        }
        return count;
    }
    public static int valueSum(int value,int length){
        int sum=0;
        int rem=0;
        int result=1;
        while(value>0){
            rem=value%10;
            sum=sum+(int) Math.pow(rem,length);
            value/=10;
        }
        return sum;
    }

}