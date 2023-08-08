package Bank.application;

public interface bankApplication {

    public  String checkBalance(String passWord);
    public String addMoney(int Money, String passWord);
    public String  withDrawal(int drawMoney,String passWord,int balance);
    public int rateOfInterest(int year);
    public String changePassword(String OldPassword,String newPassWord);



}
