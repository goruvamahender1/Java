import java.util.Scanner;



public class TakeIntegerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=1;
        int sum=0;
        while(input!=0){
            input=sc.nextInt();
            sum=sum+input;
        }
        System.out.println(sum);

    }
}
