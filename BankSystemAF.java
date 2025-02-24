import java.util.*;

abstract class BankAccount{
    Scanner in = new Scanner(System.in);
    private static int accountNumber;
    private static double balance;
    static double interestRate=7.5,i,n;
    abstract void calculateInterest();
    public double get_balance(){
        return balance;
    }
    BankAccount(){
        System.out.print("Enter Account Number : ");
        accountNumber = in.nextInt();
        System.out.print("Enter Balance : ");
        balance = in.nextDouble();
        System.out.print("Enter no.of Months : ");
        n = in.nextDouble();
    }
    static void display(){
        System.out.println("Acc.no : " + accountNumber +"\nBalance : "+balance+"\nInterest Rate : "+interestRate+"%");
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(){
        super();
    }
    void calculateInterest(){
        i = (get_balance()*interestRate*n)/100;
        System.out.println("Interest : " + i);
    }
    void updateBalance(){
        System.out.print("Updated Balance : " + (get_balance()+i));
    }
}

public class BankSystemAF
{
	public static void main(String[] args) {
	    SavingsAccount s = new SavingsAccount();
	    s.display();
	    s.calculateInterest();
	    s.updateBalance();
	    
	}
}
