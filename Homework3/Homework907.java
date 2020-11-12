import java.util.Date;
public class Homework907 {
    public static void main(String[] args)
    {
        Account swy = new Account(1122,2000);
        swy.setAnnualInterestRate(4.5/100);
        swy.withDraw(2500);
        swy.deposit(3000);
        System.out.println("Balance: "+swy.getBalance());
        System.out.println("Monthly Interest: "+swy.getMonthlyInterest());
        System.out.println("Register Date: "+swy.getDateCreated().toString());
    }
}

//Account类
class Account
{
    private int id;   //标识账号
    private double balance;  //表示余额
    private double annualInterestRate; //储存当前利率
    private final Date dateCreated;   //存储账户的开户日期

    //创建默认账户的无参构造方法
    public Account()
    {
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    //创建具有指定id和初始余额的账户的构造方法
    public Account(int di,double b)
    {
        id=di;
        balance=b;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    public int getId(){
        return id;
    }
    public void setId(int j){
        id=j;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double j){
        balance=j;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double j){
        annualInterestRate=j;
    }

    //dateCreated的访问器方法
    public Date getDateCreated(){
        return dateCreated;
    }

    //返回月利率
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    //返回月利息
    public double getMonthlyInterest(){
        return annualInterestRate/12*balance;
    }

    //从账户提取指定额度
    public void withDraw(double m){
        balance-=m;
    }

    //向账户存储指定额度
    public void deposit(double m){
        balance+=m;
    }
}