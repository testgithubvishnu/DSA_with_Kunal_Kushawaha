// BANK ATM SYSTEM MANAGEMENT USING SYNCHRONIZATION IN MULTO-THREADING
//======================================================================

import java.lang.*;

 class Account
{
    private int balance=10000;
    public int getbalance()
    {
        return balance;
    }
    public void withdraw(int amount)
    {
        balance=balance-amount;
    }
}

class Accountholder implements Runnable

{
    private Account account;
   public Accountholder(Account account)
   {
   this.account=account;
   }

   public void run()
   {
    for(int i=1;i<2;i++)
    {
        makewithdrawl(8000);
        if(account.getbalance()<0)
        {
            System.out.println("Account is overdrawn!");
        }
    }
   }

    private synchronized void makewithdrawl(int withdrawAmount)
   {
     if(account.getbalance()>=withdrawAmount)
     {
        System.out.println(Thread.currentThread().getName()+" is going to withdraw "+withdrawAmount);
         try{
            Thread.sleep(2000);
            
         }
        
         catch(InterruptedException e)
         {
            System.out.println(e);   
         }
         account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName()+ " completes the withdrawl of "+withdrawAmount);
     }
     else
     {
    System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw "+
              withdrawAmount);
     }
 }

}

public class BankATM
{
    public static void main(String[] args)
    {
    Account account = new Account();
    Accountholder acholder= new Accountholder(account);

     Thread t1= new Thread(acholder);
      Thread t2= new Thread(acholder);

    t1.setName("Avinash");
    t2.setName("Jiya");

    t1.start();
    t2.start();
    }
}