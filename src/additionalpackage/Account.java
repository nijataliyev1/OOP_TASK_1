package additionalpackage;

public class Account {
    static final String bank = "Java Bank";
    public String owner;
    double balance;

    public Account(String owner,double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    Account() {
        this("",0);
    }
}
