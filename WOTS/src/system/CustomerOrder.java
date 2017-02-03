/**
 * This class runs all the methods that are required for the customers order
 * @author Aaron Seymour and Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 
 */
package system;
import java.util.ArrayList;
public class CustomerOrder extends Order implements OutputOrders
{
	private int customerOrderID;
	private String customerOrderAddress;
	private boolean customerOrderIsCheckedOut;
	private boolean customerOrderIsPicked;
	private boolean customerOrderIsDispatched;
	/**
	 * Customer Order Constructor
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public CustomerOrder(int customerOrderID, String customerOrderAddress, boolean customerOrderIsCheckedOut, boolean customerOrderIsPicked, boolean customerOrderIsDispatched, ArrayList<Item> itemsInOrder)
	{
		super(itemsInOrder);
		this.customerOrderID = customerOrderID;
		this.customerOrderAddress = customerOrderAddress;
		this.customerOrderIsCheckedOut = customerOrderIsCheckedOut;
		this.customerOrderIsPicked = customerOrderIsPicked;
		this.customerOrderIsDispatched = customerOrderIsDispatched;
	}
	/**
	 * This method will return an integer relating to the customer ID
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public int getCustomerOrderID()
	{
		return this.customerOrderID;
	}	
	/**
	 * This returns a boolean (true or false) regarding the checked out status of a customers order 
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public boolean getCustomerOrderCheckedOutStatus()
	{
		return this.customerOrderIsCheckedOut;
	}
	/**
	 * This will set the customers order status to a boolean (true or false)
	 * @author Aaron Seymour
	 * @version 1.1
	 * @since 16/12/2016
	 */
	public void setCustomerOrderCheckedOutStatus(boolean newCheckOutStatus)
	{
		System.out.println("Customer Order ID: " + this.customerOrderID + " checked out status has been changed to " + newCheckOutStatus + "\n");
		this.customerOrderIsCheckedOut = newCheckOutStatus;
	}	
	/**
	 * This returns the customers order status as a boolean resulting in order picked status true or false
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public boolean getCustomerOrderPickedStatus()
	{
		return this.customerOrderIsPicked;
	}	
	/**
	 * This sets the customers order status to a boolean of either true or false
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public void setCustomerOrderPickedStatus(boolean newPickedStatus, Database myDatabase)
	{
		this.customerOrderIsPicked = newPickedStatus;
		if(newPickedStatus = true)
		{
			System.out.println("Removing stock for each items in this order ID: " + this.customerOrderID);
			for(Item x : itemsInOrder)//loops through each item in the purchase order.
			{
				for(Item y : myDatabase.itemTable)//loops through each item in the item list. - This could make this inefficient if the item list was larger... probably.
				{
					if(x.getItemID() == y.getItemID())//comapares the id of items in both lists to find the items we have additional stock for.
					{			
						System.out.println("Old stock count for Item " + x.getItemName() +": " + y.getStockCount() + " - stock for order: " + x.getStockCount() + " = " + (y.getStockCount() - 1 ));
						y.setStockCount(y.getStockCount() - 1);//sets the new stock count to the current stock count of the item plus the additonal stock.
					}
				}		
			}
		}
		System.out.print("\n");
	}	
	/**
	 * This returns the customers order status via a boolean resulting in true if the order has been dispatched or false if it has not
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public boolean getCustomerOrderIsDispatchedStatus()
	{
		return this.customerOrderIsDispatched;
	}
	/**
	 * This will set the customers order status using a boolean of true if the item has been dispatched
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public void setCustomerOrderIsDispatchedStatus(boolean newDispatchedStatus)
	{
		System.out.println("Customer Order ID: " + this.customerOrderID + " dispatched status has been changed to " + newDispatchedStatus + "\n");
		this.customerOrderIsDispatched = newDispatchedStatus;		
	}	
	/**
	 * This outputs the details of the variables for a specified CustomerObject object.
	 * @author Jack Gallacher
	 * @version 1.1
	 * @since 21/12/2016
	 */
	@Override
	public String outputDetails()
	{
		String details="";
		System.out.println("Order details for customer order ID: " + this.customerOrderID);
		System.out.println("Address of this order: " + this.customerOrderAddress);
		if(this.customerOrderIsCheckedOut == true)
		{
			System.out.println("This customer order has been checked out.");
			details+="This customer order has been checked out.";
		}else
		{
			System.out.println("This customer order has not been checked out.");
			details+="This customer order has not been checked out.";
		}
		if(this.customerOrderIsPicked == true)
		{
			System.out.println("This customer order has been picked.");
			details+="This customer order has been picked.";
		}else
		{
			System.out.println("This customer order has not been picked.");
			details+="This customer order has not been picked.";
		}
		if(this.customerOrderIsDispatched == true)
		{
			System.out.println("This customer order has been dispatched.");
			details+="This customer order has been dispatched.";
		}else
		{
			System.out.println("This customer order has not been dispatched.");
			details+="This customer order has not been dispatched.";
		}
		System.out.print("\n");
		return details;
	}
	/**
	 * This prints out the items in the specified CustomerOrder object.
	 * @author Jack Gallacher
	 * @version 1.1
	 * @since 21/12/2016
	 */
	@Override
	public String printItemsInOrder() 
	{
		String details = "";
		System.out.println("These are the items contained in customer order ID: " + this.getCustomerOrderID());
		for(Item myItem : itemsInOrder)
		{
			System.out.println("ID: " + myItem.getItemID());
			details += "ID: " + myItem.getItemID();
			System.out.println("Name: " + myItem.getItemName());
			details += "ID: " + myItem.getItemName();
			System.out.println("Stock: " + myItem.getStockCount());
			details += "ID: " + myItem.getStockCount();
			System.out.println("Location: " + myItem.getItemLocationInWarehouse() + "\n");
			details += "ID: " + myItem.getItemLocationInWarehouse();
			
		}		
		return details;
	}
}
