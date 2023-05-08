class Bank{
    public String name;
    public long account_no;
    private String password;

    public String getPassword(){
        return this.password; 
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class Private_AccessModifier {
    public static void main(String[] args) {
        Bank account1=new Bank();
        account1.setPassword("abcd");
        account1.getPassword();
        
    }
    
}
