import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String num=sc.next();
        int range=sc.nextInt();
        int calculate;
        for(int i=1;i<=range;i++){
            calculate=number*i;
            System.out.println(num+" * "+i+"= "+calculate);
        }

    }
}
