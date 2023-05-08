public class GCD {
    public static void main(String[] args) {
        int a=56;
        int b=48;
        for(int i=Math.min(a,b);i>=2;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
        
        
    }
}

// GCD is get the common highest number that divides both num1 and num2. Here you can see 8 is the highest number that 
// divided both 56 and 48.
// 56- 2 4 7 8 14 28 56
// 48- 2 3 4 6 8 12 16 24 48   
 