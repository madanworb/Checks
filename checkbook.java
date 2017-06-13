**
 * checkbook will gather all my checks.
 *
 * @author  (adam brown)
 * @version (7/6/17)
 */

public class CheckBook
{
    private int Total;
    private Arraylist<Check> myCheck;
    
    /**
     *
     */
    public CheckBook(int total)  
    {
        mycheck = new Arraylist <Check>();
        total = Total;
    }



    /**
     * have to get check totals
     */
    public int getTotal()
    {
        // put your code here
        return total;
    }

    /**
     * add checks to checklist
     */
    public void addCheck (Check newCheck)
    {
        Check.add(newCheck);
    }

    /**
     * make an arraylist of check
     */
    public Arraylist<Check>()
    {
        Check[] mycheck = newCheck[];
    }
    /**
     * print check in checkbook
     */
    public void printlist()
    {
        for(Checks check : checks) {
                check.printCheck();
    }
