/**
 * we are going to find everything we need to about the check so we can input them
 * into a checkbook.
 *
 * @author (adam brown)
 * @version (june 6th 2017)
 */
public class Check
{
   // the payee's name
   private String payee;
   // the amount of the check
   private double amount;
   // what the check is for
   private String memo;
   // what is the check number
   private String number;
   // whats the date
   private String date;
   
   /**
     * create a check with payeeName, Date, checkAmount, memo, and checkNumber.
     */
   public Check(String Payee, double Amount, String Memo, String Number, String Date)
    {
        payee = Payee;
        amount = Amount;
        memo = Memo;
        number = Number;
        date = Date;
    }
   
   /**
     * use the get function to find out the check issue date
     */
   public String getPayee()
    {
        // put your code here
        return payee;
    }
 
    /**
     * use get function to find out the amount of check
     */
   public double getAmount()
    {
        // put your code here
        return amount;
    }
   /**
     * use get function to find out what the check was for
     */
   public String getMemo()
    {
        // put your code here
        return memo;
    }
    /**
     * get function to find out the check numbers
     */
    public String getNumber()
    {
        // put your code here
        return number;
    }
    /**
     * get function to find the date of check
     */
    public String getDate()
    {
        // put your code here
        return date;
    }
    /**
     * what the checks should look like when printed
     */
    public void printCheck()
    {
        // put your code here
        System.out.println("Adam Brown              "+  number);
        System.out.println("Pay to the order of:" + payee + "   $" + amount);
        System.out.println("Memo: " + memo);
    }
