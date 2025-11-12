
import accounts.User;
// scanner import

import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        User u1 = new User("jojo","12334");

        System.out.println("prev name : "+ u1.name);
        System.out.println("enter new  name : ");

        String newname = sc.nextLine();
        u1.name = newname;

        System.out.println("updated name : "+ u1.name);

        System.out.println("prev pass : "+ u1.getPass());

        String np = sc.nextLine();
        u1.setPass(np);
        System.out.println("updated Pass; "+ u1.getPass());







    }
}