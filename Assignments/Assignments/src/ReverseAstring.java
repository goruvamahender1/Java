//run a loop from i=length-1 to i>=0 
//get the character at i
//str=lm


import java.util.Scanner;
public class ReverseAstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String value=sc.next();
        String str="";
        for(int i=value.length()-1;i>=0;i--){
            str=str+value.charAt(i);
        } 
        System.out.println(str); 
    }
}