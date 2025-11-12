package accounts;

public class Accounts{
    public int accNo;
    public String name;
    public double balance;

    public Accounts( String name, int accNo, double balance){
        this. name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if (balance> amount){
            balance -= amount;


        }
        else {
            System.out.println("insuffocient ballance , balance is : "+ balance);
        }
    }

    // check balance 
    public double checkBalance(){
        return balance;
    }




}