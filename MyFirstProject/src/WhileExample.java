import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String value=" ";
        while(!value.equals("x")){
            value=sc.nextLine();
        }
    }  
}
