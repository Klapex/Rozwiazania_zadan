package Modyfikatory_Dostepu;

public class Bank implements BankTransfer {

    public final int TRANSFER_FEE = 1;

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount(0);// Otwieranie nowego konta
        BankAccount myAccount2 = new BankAccount(0);
        Bank main = new Bank();

        //Testowanie dzialanie metod

        myAccount.deposit(500);
        System.out.println("Stan konta my account 1 :"+myAccount.getBalance());

        main.transfer(myAccount, myAccount2, 250);

        System.out.println("Stan kont po transakcji:");
        System.out.println("My account 1 :"+myAccount.getBalance());
        System.out.println("My account 2 :"+myAccount2.getBalance());

    }
    @Override
    public void transfer(BankAccount from, BankAccount to, int amount){
        if(amount>from.getBalance()){
            System.out.println("Niewystarczaje srodki do wykonanie przelewu.");

        }
        else{
            from.setBalance(-(amount+TRANSFER_FEE));
            to.setBalance(amount);
        }}

    }

