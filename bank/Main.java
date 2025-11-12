import java.util.Scanner;
import accounts.Accounts;


public class Main {
    public static void allOption(){
        System.out.println("chose operation: 1. deposit 2.withdraw 3.check balance");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        Accounts acc = new Accounts("jojo",122434,3300);
        
        while (true){
            // switch (choise){
            //     case 1:
            //         System.out.println("enter amount to deposit");
            //         double amount = sc.nextDouble();
            //         acc.deposit((int)amount);
            //         System.out.println("new ballance "+ acc.checkBalance());

            //         break;

            //     case 2:
            //         break;
            //     case 3:
            //         break;
            //     default:
            //         System.out.println("invalid");
            //         return;

            allOption();
            int choise = sc.nextInt();

            if (choise == 1){
                System.out.println("enter amount to deposit");
                double amount = sc.nextDouble();
                acc.deposit((int)amount);
                System.out.println("new ballance "+ acc.checkBalance());
                


            }
            else if (choise == 2){
                System.out.println("enter amount to withdraw:");
                double amount = sc.nextDouble();
                acc.withdraw((int)amount);
                System.out.println("new ballance "+ acc.checkBalance());
            }

            else if (choise == 3){
                System.out.println("current ballance :"+ acc.checkBalance());

            }
        }

        }
           
    }
