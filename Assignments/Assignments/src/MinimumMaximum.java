//Take three inputs
//assign a to be max, if b to be max b>max and b>c if c>max and c>b

import java.util.Scanner;
public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int maxmimum=Maximum(first,second,third);
        int minimum=Minimum(first,second,third);
        System.out.println("Maximum "+maxmimum);
        System.out.println("Minimum "+minimum);
    }
    public static int Minimum(int a,int b,int c){
        int min=a;
        if(b<min && b<c){
            min=b;
        }
        if(c<min && c<b){
            min=c;
        }
        return min;
    }
    public static int Maximum(int a,int b,int c){
        int max=a;
        if(b>max && b>c){
            max=b;
        }
        if(c>max && c>b){
            max=c;
        }
        return max;
    }
}
