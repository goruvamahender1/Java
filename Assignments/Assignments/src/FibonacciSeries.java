import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(a);
        }
        else{
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");

            }
            
        }

        
    }
    
}





// 5
// 0 1 1 2 3 5