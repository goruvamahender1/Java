import java.util.Scanner;
public class AverageOfNnumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int total=N;
        int sum=0;

        while(N>=1){
            int value=sc.nextInt();
            sum=sum+value;
            N--;
        }
        System.out.println(sum/total);
    }
}