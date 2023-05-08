import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean check=check(s);
        System.out.println(check);

    }
    static boolean check(String s){
        int length=s.length();
        int mid=(int) (length/2);

        for(int i=0;i<mid;i++){
            if(s.charAt(i)!=s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
        
    }
}
