public class AccessModifiers{
    public static void main(String arg[]){
        BankAccount myAcc = new BankAccount();

        myAcc.username = "md asad";
        myAcc.setPassword("abcdefghijk");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}