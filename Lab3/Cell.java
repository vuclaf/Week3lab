 

/**A class similar to a singly Linked List's node
 * @author Evan Vu
 */
public class Cell {
	private Integer val;
	private Cell next;
	
	public Cell(Integer val) {
		this.val = val;
	}
	
	/**A method to add a cell to the list
	 * @return Append a new Cell next to the final Cell
	 * @param The value stored in the appended Cell
	 */
	public void append(Integer x) {
		if (this.next==null) {
			this.next= new Cell(x);
			return;
		}
		next.append(x);
	}
	
	/**A method to return a String made by the values of all Cells
	 * @return A String constructed by the values of all the Cells linked
	 */
	public String toString() {
		String result;
		while(!(this==null)&&!(next==null)) {
			result = Integer.toString(this.val);
			result+=next.toString();
			return result;
		}
		return Integer.toString(this.val);
	}
}
