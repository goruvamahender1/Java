import java.util.Scanner;
public class UserInputCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        String operand=sc.next();
        if(operand.equals("+")){
            c=a+b;
        }
        if(operand.equals("-")){
            c=a-b;
        }
        if(operand.equals("*")){
            c=a*b;
        }
        if(operand.equals("/")){
            c=a/b;
        }
        System.out.println(c);

    }
}
