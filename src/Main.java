import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and initial balance");
        String name=sc.next();
        int balance=sc.nextInt();

        SBIUser acc1=new SBIUser(name,balance,"sudheer");
        String accNo=acc1.getAccountNo();
        System.out.println("The account number of "+name+" is: "+accNo);

        System.out.println("Enter money you want to add");
        int money =sc.nextInt();
        acc1.addMoney(money);
        System.out.println("Updated balance: "+acc1.getBalance());

        System.out.println("enter money to withdraw");
        money=sc.nextInt();
        System.out.println("password");
        String password=sc.next();
        String result=acc1.withDrawMoney(money,password);
        System.out.println(result);
        System.out.println("Updated balance "+acc1.getBalance());


    }
}