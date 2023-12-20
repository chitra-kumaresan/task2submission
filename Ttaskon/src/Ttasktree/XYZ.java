package Ttasktree;

public class XYZ {
    public static void main(String[] args) {
        Account account=new Account(500,400);
        account.display();
        account.setDepositAmount(1500);
        account.setWithdrawAmount(200);
        account.display();
    }
}
