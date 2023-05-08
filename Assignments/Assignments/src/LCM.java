import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int higher;
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>a){
            higher=b;
        }
        else{
            higher=a;
        }
        int value;
        value=higher;
        while(true){
            if(higher%a==0 && higher%b==0){
                System.out.println(higher);
                break;
            }
            else{
                higher=higher+value;
            }
        }
    }
}
