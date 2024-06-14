import java.util.*;
interface atmachine
{
    void deposit();
    void withdraw();
    void checkbalance();
    void menu();
}
public class atm implements atmachine
{
    double balance;
   atm(double initial)
   {
        balance=initial;
   }
   public void deposit()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the deposit amount:");
    double amount=sc.nextDouble();
    if(amount<=0)
    {
        System.out.println("Invalid Amount to deposit");
    }
    else
    {
        balance=balance+amount;
        System.out.println("Your money has been deposited successfully");
        checkbalance();
    }
   }
   public void withdraw()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount you want to withdraw:");
    double withdraw=sc.nextDouble();
    if(withdraw<=0)
    {
        System.out.println("Invalid Amount to withdraw");
    }
    else
    {
        balance=balance-withdraw;
        System.out.println("Collect your money!!!");
        System.out.println("Don't foreget your card!!!");
        checkbalance();
    }
   }
   public void checkbalance()
   {
    System.out.println("Current Balance: Rs" + balance+"/-");
   }
   public void menu()
   {
    System.out.println("---------------------Menu----------------------------");
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.Check Balance");
    System.out.println("4.Exit");
    System.out.println("Now Enter your choice:");
    System.out.println("--------------------------------------------------------");
   }
   public static void main(String args[]) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your username:");
    String username=sc.nextLine();
    System.out.println("Enter your passwsord:");
    String password=sc.nextLine();
    atm a=new atm(10000.0);
    a.menu();
    int ch=sc.nextInt();
    switch (ch)
    {
        case 1:
            a.deposit();
            break;
        case 2:
            a.withdraw();
            break;
        case 3:
            a.checkbalance();
            break;
        case 4:
            System.out.println("Thankyou for using the ATM Services");
            break;
        default:
            System.out.println("Invalid Choice!!!!");
    }

   }
}
