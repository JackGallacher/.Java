/**
 * Order Abstract Class
 * @author Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 
 */
package system;
import java.util.ArrayList;

public abstract class Order 
{
	public ArrayList<Item>itemsInOrder = new ArrayList<Item>();
	/**
	 * Constructor that add an item list to the instance of object. This list is passed from either CustomerOrder or PurchaseOrder to this parent class.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public Order(ArrayList<Item> itemsInOrder)
	{
		this.itemsInOrder = itemsInOrder;
	}
}
