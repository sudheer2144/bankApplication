import java.util.UUID;

public class SBIUser implements BankInterface{

    private String AccountNo;
    public String Name;
    private int balance;
    private static float rateofInterest;

    private String password;

    //Constructor
    SBIUser(String Name,int balance,String passsword)
    {
        this.balance=balance;
        this.Name=Name;
        this.password=passsword;
        this.AccountNo=String.valueOf(UUID.randomUUID());
    }

    public String getAccountNo(){
        return AccountNo;
    }

    public int getBalance(){
        return balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {

        balance = balance+money;
        return "enjoy";
    }

    @Override
    public String withDrawMoney(int money,String enteredPassword) {

        if(money<=balance&&password.equals(enteredPassword))
        {
            balance=balance-money;
            return "enjoy";

        }
        else {
            String q="''";
            return q+"chuusuko bhayya"+q;
        }
    }

    @Override
    public float calculateInterest(int years) {

        float interest=(balance*years*rateofInterest)/100;
        return interest;
    }
}
