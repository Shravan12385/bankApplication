package Bank.application;

import java.util.UUID;

public class SBI implements  bankApplication{

    private String AccountNumber;
    private String PassWord;
    private int balance;
    private static  int rateOfinterest =10;


    public SBI (String password,int balance)
    {
        this.AccountNumber = (UUID.randomUUID().toString());
        this.PassWord = password;
        this.balance = balance;
    }
    @Override
    public String checkBalance( String passWord) {
        if(this.PassWord.equals(passWord))
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
        if(this.PassWord.equals(passWord))
        {
            balance = balance+Money;
            String totalSum = Money+"is crediated in "+AccountNumber+"totalbalance is "+balance;
            return totalSum;
        }
        else
        {
            return "Please enter correct password";
        }
    }

    @Override
    public String withDrawal(int drawMoney, String passWord, int balance) {
        if(this.PassWord.equals(passWord))
        {
            if(drawMoney<balance)
            {
                balance = balance-drawMoney;
                return "remaining balance in AccountNumber "+AccountNumber+"is rupees"+balance;
            }
            else
            {
                return "insuffuient amount please enter check balance";
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
        if(this.PassWord==OldPassword)
        {
            OldPassword = newPassWord;
            return "passWord is changed successfully";
        }
        else
        {
            return "please enter correct oldpassword";
        }
    }
}
