package Ttasktree;

public class Account {
    public  Integer depositAmount;
    public Integer withdrawAmount;
public Integer balance;
    public Account(){

    }
    public Account(Integer depositAmount,Integer withdrawAmount){
        this.depositAmount=depositAmount;
        this.withdrawAmount=withdrawAmount;

    }


    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawAmount(Integer withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void display(){
         this.balance=depositAmount-withdrawAmount;
        System.out.println("Balance is "+ balance);

    }
}
