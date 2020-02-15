 

/**A class that inherits IntegerListADT and have linked cells that store integer values
 * @author Evan Vu
 */
public class IntegerList extends IntegerListADT {
	private Cell root;
	
	public IntegerList() {
	}
	
	/**
	 * A method to add into the Integer List a new cell
	 * @param The value of the appended cell
	 */
	public void append(Integer x) {
		if (root==null){
			Cell newCell = new Cell(x);
			root = newCell;
			return;
		}
		root.append(x);
	}
	
	/**
	 * Return the value of root as a String
	 * @return The value in root as a String
	 */
	public String toString() {
		if (root==null) {
			return "Empty";
		}
		return root.toString();
	}
	
	/**
	 * Check if root is empty
	 * @return true if root is empty, false if it is not
	 */
	public boolean isEmpty() {
		if (root==null) {
			return true;
		}
		return false;
	}
}
