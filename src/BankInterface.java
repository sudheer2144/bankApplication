interface BankInterface {

    public int checkBalance();

    public String addMoney(int money);

    public String withDrawMoney(int money,String password);

    public float calculateInterest(int years);

}
