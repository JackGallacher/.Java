/**
 * PurchaseOrder Class
 * @author Aaron Seymour and Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 
 */
package system;
import java.util.ArrayList;
public class PurchaseOrder extends Order implements OutputOrders
{
	private int purchaseOrderID;
	private boolean purchaseOrderIsDelivered;
	
	public PurchaseOrder(int purchaseOrderID, boolean purchaseOrderIsDelivered, ArrayList<Item> itemsInOrder)
	{
		super(itemsInOrder);
		this.purchaseOrderID = purchaseOrderID;
		this.purchaseOrderIsDelivered = purchaseOrderIsDelivered;
	}		
	/**
	 * Returns the purchase order ID as an integer.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public int getPurchaseOrderID()
	{
		return this.purchaseOrderID;
	}	
	/**
	 * Gets and then increments the stock level of items within the purchase order items list.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	public void replenishStockToItemStockCount(Database myDatabase)
	{
		System.out.println("Replenishing stock to items from purchase order ID: " + this.purchaseOrderID);
		for(Item x : itemsInOrder)//loops through each item in the purchase order.
		{
			for(Item y : myDatabase.itemTable)//loops through each item in the item list. - This could make this inefficient if the item list was larger... probably.
			{
				if(x.getItemID() == y.getItemID())//comapares the id of items in both lists to find the items we have additional stock for.
				{			
					System.out.println("Old stock count for item " + x.getItemName() +": " + y.getStockCount() + " + additional stock: " + x.getStockCount() + " = " + (y.getStockCount() + x.getStockCount() ));
					y.setStockCount(x.getStockCount() + y.getStockCount());//sets the stock count to the current stock count plus the additional stock count.
				}
			}		
		}
		System.out.print("\n");
	}	
	/**
	 * Sets the boolean value of if the purchase order is delivered (true) or not (false).
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	public void setPurchaseOrderToDelivered(boolean newPurchaseOrderDeliveryStatus)
	{
		System.out.println("Purchase Order ID: " + this.purchaseOrderID + " delivered status has been changed to " + newPurchaseOrderDeliveryStatus + "\n");
		this.purchaseOrderIsDelivered = newPurchaseOrderDeliveryStatus;		
	}	
	/**
	 * Returns boolean value if the purchase order has been delivered (true) or not delivered (false) 
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since  20/12/2016
	 */
	public boolean getPurchaseOrderDeliveryStatus()
	{
		return this.purchaseOrderIsDelivered;
	}	
	/**
	 * Prints out the details of the purchase order variables.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	@Override
	public String outputDetails() 
	{
		String details = "";
		System.out.println("Order details for purchase order ID: " + this.purchaseOrderID);
		if(this.purchaseOrderIsDelivered == true)
		{
			System.out.println("This purchase order has been delivered.");
			details+="This purchase order has been delivered.";
		}else
		{
			System.out.println("This purchase order has not been delivered.");
			details+="This purchase order has not been delivered.";
		}
		System.out.print("\n");
		return details;
	}
	/**
	 * Prints the items stores within the current purchase order item list.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	@Override
	public String printItemsInOrder() 
	{
		String details = "";
		System.out.println("These are the items contained in purchase order ID: " + this.getPurchaseOrderID());
		for(Item myItem : itemsInOrder)
		{
			System.out.println("ID: " + myItem.getItemID());
			details += "ID: " + myItem.getItemID();
			System.out.println("Name: " + myItem.getItemName());
			details += "Name: " + myItem.getItemName();
			System.out.println("Stock: " + myItem.getStockCount());
			details += "Stock: " + myItem.getStockCount();
			System.out.println("Location: " + myItem.getItemLocationInWarehouse() + "\n");
			details += "Location: " + myItem.getItemLocationInWarehouse();
			
		}	
		return details;
	}
}
