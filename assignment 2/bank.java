

class Account {
  private String Name;
  private long AccNo;
  private String AccType;
  private double AccBalance;

  public void getData()
  {
      Name="cdac";
      AccNo=759642318;
      AccType="saving";
      AccBalance=4598756.54;
  }
  void deposit()
  {
      System.out.println("old balance"+AccBalance);
      double a=AccBalance+5000;
      System.out.println("new balance"+ a);
  }
    void withdraw()
    {
        System.out.println("old balance"+AccBalance);
        double b=AccBalance-5000;
        System.out.println("new balance"+b);
    }
    void display()
    {
        System.out.println("name of depositor :"+ Name);
       // System.out.println("Account number:"+ AccNo);
        //System.out.println("Account type:"+ AccType);
        System.out.println("Account balance:"+ AccBalance);

    }
}
class  Bank{
    public static void main(String args[]) {

    Account obj = new Account();
    System.out.println("initialising values");
    obj.getData();
    System.out.println("depositing amount");
    obj.deposit();
    System.out.println("withdraw amount");
    obj.deposit();
    obj.display();

}
}