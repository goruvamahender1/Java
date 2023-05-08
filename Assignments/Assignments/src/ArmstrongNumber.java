import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int digit;
        int sum=0;
        int temp=value;
        int count=Counter(value);
        while(value>0){
            digit=value%10;
            sum=sum+(int) Math.pow(digit,count);
            value/=10;


        }   
        System.out.println(temp==sum);
    }
    public static int Counter(int value){
        int count=0;
        while(value>0){
            value/=10;
            count++;

        }
        return count;
    }
}
