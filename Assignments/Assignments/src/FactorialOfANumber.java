import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int fact=1;
        if(input<0){
            System.exit(0);
        }
        for(int i=1;i<=input;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
