import java.util.Scanner;

class BankAccount{
    int account_Number;
    double balance;
    String account_Holder;
    String Name;
    public void depositMoney(int depositBalance){
        balance=balance+depositBalance;
        System.out.println("the new balance is "+balance);
    }
    public void withdrawMoney(int withdrawBalance){
        balance=balance-withdrawBalance;
        System.out.println("the money after withdrawal "+balance);
    }
    public void checkBalance(){
        System.out.println("the current balance is "+balance);
    }
}
public class Lab6C1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of accounts");
        int n = sc.nextInt();
        BankAccount []B = new BankAccount[n];
        for(int i=0;i<n;i++){
            B[i] = new BankAccount();

        }
        //scanning default balance from user
        for(int i=0;i<n;i++){
            System.out.println("enter the default balance");
            B[i].balance=sc.nextDouble();

        }
        //printing default balance
        for(int i=0;i<n;i++){
            System.out.println("the balance are"+B[i].balance);
        }
        System.out.println("enter 1 to deposit Money \n enter 2 to withdraw money \n enter 3 to check balance");
        int check = sc.nextInt();
       switch (check) {
        case 1:
            System.out.println("enter the balance you want to deposit");
            int bal = sc.nextInt();
            System.out.println("enter the account to deposit");
            int ind = sc.nextInt();
            B[ind].depositMoney(bal);
            
            break;
        case 2:
        System.out.println("enter the balance you want to deposit");
        int withbal = sc.nextInt();
        System.out.println("enter the account to deposit");
        int inde = sc.nextInt();
        B[inde].withdrawMoney(withbal);
        break;
        case 3:
        System.out.println("enter the account you want to check bal");
        int index=sc.nextInt();
        B[index].checkBalance();
        break ;

        default:
            break;
       }
    }
}
