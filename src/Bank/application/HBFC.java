package Bank.application;

import java.util.UUID;

public class HBFC implements bankApplication{

    private String  AccountNumber;
    private String PassWord;
    private int balance;
    private static  int rateOfinterest =20;

    public HBFC (String PassWord,int balance)
    {
        this.AccountNumber = (UUID.randomUUID().toString());
        this.PassWord = PassWord;
        this.balance = balance;
    }
    @Override
    public String checkBalance( String passWord) {
        if(passWord.equals(this.PassWord))
        {
            String ans = "total amount in"+AccountNumber+balance;
            return ans;
        }
        else
        {
            return "please enter correct PassWord";
        }
    }

    @Override
    public String addMoney(int Money, String passWord) {
        if(passWord.equals(this.PassWord))
        {
            balance = balance+Money;
            String totalSum = Money+"is crediated in"+AccountNumber+"totalbalance is "+balance;
            return totalSum;
        }
        else
        {
            return "Please enter correct password";
        }
    }

    @Override
    public String withDrawal(int drawMoney, String passWord, int balance) {
        if(PassWord.equals(this.PassWord))
        {
            if(drawMoney<balance)
            {
                balance = balance-drawMoney;
                return "remaining balance in AccountNumber"+AccountNumber+"is rupees"+balance;
            }
            else
            {
                return "insuffuient amount";
            }
        }
        else {
            return "please enter correct password";
        }

    }

    @Override
    public int rateOfInterest(int year) {
        int totalSum = (balance*year*rateOfinterest)/100;
        return totalSum;
    }

    @Override
    public String changePassword(String OldPassword, String newPassWord) {
        if(OldPassword.equals(this.PassWord))
        {
            this.PassWord = newPassWord;
            return "passWord is changed successfully thank you";
        }
        else
        {
            return " enter correct oldpassword";
        }
    }
}
