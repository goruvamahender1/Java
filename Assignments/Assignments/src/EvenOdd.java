import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        boolean condition=Odd(value);
        if(condition){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }

    }

    static boolean Odd(int value){
        return((value & 1)==1);
    }
}
