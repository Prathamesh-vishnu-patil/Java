public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username="Prathamesh";
        myAcc.setPassword("hello");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}