

class Account {
  private String Name;
  private long AccNo;
  private String AccType;
  private double AccBalance;

  public Account(String Name, long AccNo, String AccType, double AccBalance)//parameterized constructor
  {
      this.Name=Name;
      this.AccNo=AccNo;
      this.AccType=AccType;
      this.AccBalance=AccBalance;
  }
  public Account(double AccBalance, double deposit)
  {
      this.AccBalance=AccBalance;
      System.out.println("old balance"+AccBalance);
      double a=AccBalance+deposit;
      System.out.println("new balance"+ a);
  }
    public void withdraw()
    {
        System.out.println("old balance"+AccBalance);
        double b=AccBalance-5000;
        System.out.println("new balance"+b);
    }
    public Account(Account a)//copy constructor
    {
        this.Name=a.Name;
        this.AccBalance=a.AccBalance;
        System.out.println("name of depositor :"+ Name);
       // System.out.println("Account number:"+ AccNo);
        //System.out.println("Account type:"+ AccType);
        System.out.println("Account balance:"+ AccBalance);

    }
}
class  Bank{
    public static void main(String args[]) {
        System.out.println("initialising values");
    Account obj = new Account("cdac", 759642318, "saving", 4598756.54);
    System.out.println("depositing amount");
        Account obj1 = new Account(4598756.54, 5000);
    System.out.println("withdraw amount");
    obj.withdraw();
    Account obj3 = new Account(obj);

}
}