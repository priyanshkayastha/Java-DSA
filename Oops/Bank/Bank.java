package Oops.Bank;

class Account {

    public String name;
    protected String email;
    private String password;

    // getter
    public String getPassword() {
        return this.password;
    }

    // setter

    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "ABC";
        account1.email = "abc@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }

}
