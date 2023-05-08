import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=sc.nextInt();   
        int npr=npr(n,r);
        int ncr=ncr(n,r);
        System.out.println(ncr+" "+npr);
    }

    public static int npr(int n,int r){
        int numerator=factorial(n);
        int denominator=factorial(n-r);
        return ((int)(numerator/denominator));
    }
    public static int ncr(int n,int r){
        int numerator=factorial(n);
        int denominator=factorial(r)*factorial(n-r);
        return ((int)(numerator/denominator));
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
