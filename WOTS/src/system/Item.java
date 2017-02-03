/**
 * The item class runs all the methods that are required for the item
 * 
 * 
 * @author Aaron Seymour and Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 
 */
package system;
import java.awt.Point;
public class Item 
{	
	private int itemID;
	private String itemName;
	private String itemType;
	private double itemCost;
	private int stockCount;
	private boolean canBeOrdered;
	private boolean requiresPorouswareApplied;
	public Point itemLocationInWarehouse = new Point();
	
	/**
	 * Constuctor for the Item object
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	//This is the constructor
	public Item(int itemID, String itemName, String itemType, double itemCost, int stockCount ,boolean canBeOrdered, boolean requiresPorouswareApplied, int locationInWarehouseX, int locationInWarehouseY)
	{
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemCost = itemCost;
		this.stockCount = stockCount;
		this.canBeOrdered = canBeOrdered;
		this.requiresPorouswareApplied = requiresPorouswareApplied;
		this.itemLocationInWarehouse = new Point(locationInWarehouseX, locationInWarehouseY);
	}	
	/**
	 * This returns an integer for the item ID
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public int getItemID()
	{
		return this.itemID;
	}
	/**
	 * Returns a string of the item name
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public String getItemName()
	{
		return this.itemName;
	}
	/**
	 * This returns a string of the items type
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public String getItemType()
	{
		return this.itemType;
	}
	/**
	 * This returns a double of the items cost
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public double getItemCost()
	{
		return this.itemCost;
	}
	/**
	 * Returns an integer of the items stock count
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public int getStockCount()
	{
		return this.stockCount;
	}
	/**
	 * Sets an integer to the stock count of an item
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public void setStockCount(int newStockCount)
	{
		this.stockCount = newStockCount;
	}
	/**
	 * Returns a boolean depending on the order status 
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public boolean getCanBeOrderedStatus()
	{
		return this.canBeOrdered;
	}
	/**
	 * This will returns a point (x and y coordinates) of the item in the warehouse
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public Point getItemLocationInWarehouse()
	{
		return this.itemLocationInWarehouse;
	}
	/**
	 * This returns a boolean depending on if the item has porousware or not
	 * @author Aaron Seymour
	 * @version 1.0
	 * @since 16/12/2016
	 */
	public boolean getRequiresPorouswareApplied()
	{
		return this.requiresPorouswareApplied;
	}
	/**
	 * This prints out the core details of an item
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2012
	 */
	public void printDetailsOfThisItem()
	{
		System.out.println("Datails of item ID: " + this.itemID);
		System.out.println("Name: " + this.itemName);
		System.out.println("Type: " + this.itemType);
		System.out.println("Stock: " + this.stockCount);
		System.out.println("Location: " + this.itemLocationInWarehouse + "\n");
	}
}
