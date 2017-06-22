import java.util.*;
public class CheckBook {
	private static final Check Check = null;
	private int Total;
	private ArrayList<Check> checkList;
	public ArrayList<Check> getCheckList() {
		return checkList;
	}
	public void setCheckList(ArrayList<Check> checkList) {
		this.checkList = checkList;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public void add(Check newCheck) {
		 this.add(newCheck);
	}
	public void printList(){
		for (int i = 0; i < checkList.size(); i++) {
			Check.printCheck();
        }

    }
}
