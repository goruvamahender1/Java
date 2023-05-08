//Initialize any array of size 26 whose values are 0 initially
//then we get the each character in the sentence and then update the value of  character position to be true



public class ArrayEasy10 {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        boolean[] initial=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            initial[-(int)sentence.charAt(i)-97]=true;
        }
        for(int i=0;i<26;i++){
            if(initial[i]==false){
                System.out.println("False");
                break;
            }
        }
    }
}
