/**
 * Warehouse Class 
 * @author Aaron Seymour and Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 
 */
package system;
import java.awt.Point;
import java.util.ArrayList;

//Warehouse is a Singleton Class, the company has only one Warehouse.
public class Warehouse 
{
	/**
	 * Warehouse Constructor and Singleton pattern implementation.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	private static Warehouse instance = null;
	
	//This is the constructor 
	protected Warehouse()
	{
		
	}	
	
	//This insures that there can only be one instance of the warehouse class
	public static Warehouse getInstance()
	{
		if(instance == null)
		{
			instance = new Warehouse();
		}
		return instance;
	}
	/**
	 * Invokes the other methods in the program.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public static void main(String[] args) 
	{	
		//This are the specialised ArrayLists in the program which store items/orders with specific characteristics. This mimics database calls to select items with specific criteria.
		ArrayList<Point> bestPickingPath = new ArrayList<Point>();	
		
		//creates instances of database and warehouse to call thier functions.
		Database myDatabase = new Database();
		Warehouse myWarehouse = Warehouse.getInstance();
		
		//run the functions that create and populate the lists within this program to mock a database implementation. 
		myDatabase.createItemDatabase();	
		
		//List of working functions/implementations in the program to view, just in case we don't get an interface completed.		
		myDatabase.itemTable.get(0).printDetailsOfThisItem();
		
		myWarehouse.viewCustomerOrdersAwaitingCheckOut(myDatabase);
		myWarehouse.viewCustomerOrdersAwaitingDispatch(myDatabase);
		myWarehouse.viewCustomerOrdersAwaitingPicking(myDatabase);
		
		myDatabase.customerOrderTable.get(0).printItemsInOrder();
		myDatabase.customerOrderTable.get(0).outputDetails();
		
		myDatabase.customerOrderTable.get(0).setCustomerOrderCheckedOutStatus(true);
		myDatabase.customerOrderTable.get(1).setCustomerOrderIsDispatchedStatus(true);
		myDatabase.customerOrderTable.get(2).setCustomerOrderPickedStatus(true, myDatabase);
		
		myWarehouse.viewCustomerOrdersCheckedOut(myDatabase);
		myWarehouse.viewCustomerOrdersDispatched(myDatabase);
		myWarehouse.viewCustomerOrdersPicked(myDatabase);
		myWarehouse.viewPurchaseOrdersAwaitingDelivery(myDatabase);
		
		myDatabase.purchaseOrderTable.get(0).setPurchaseOrderToDelivered(true);
		myWarehouse.viewPurchaseOrdersAwaitingDelivery(myDatabase);
		
		myDatabase.purchaseOrderTable.get(0).printItemsInOrder();
		myDatabase.purchaseOrderTable.get(0).replenishStockToItemStockCount(myDatabase);
		
		myWarehouse.calculateBestPickingPath(myDatabase.customerOrderTable.get(0), bestPickingPath);
	}	
	/**
	 * Displays the orders that are waiting to be checked out.
	 * @author Jack Gallacher
	 * @version 1.1
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersAwaitingCheckOut(Database myDatabase)
	{
		System.out.println("List of customer orders awaiting check out");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderCheckedOutStatus() == false)
			{
				System.out.println("Customer Order ID: "+ x.getCustomerOrderID());
			}
		}
		System.out.print("\n");
	}	
	/**
	 * Displays the orders that have been checked out.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersCheckedOut(Database myDatabase)
	{
		System.out.println("List of customer orders that have been checked out");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderCheckedOutStatus() == true)
			{
				System.out.println("Customer Order ID: "+ x.getCustomerOrderID());
			}
		}
		System.out.print("\n");
	}	
	/**
	 * Display all the customers orders that are awaiting dispatch
	 * @author Jack Gallacher
	 * @version 1.1
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersAwaitingDispatch(Database myDatabase)
	{
		System.out.println("List of customer orders that are awaiting dispatch");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderIsDispatchedStatus() == false)
			{
				System.out.println("Customer Order ID: " + x.getCustomerOrderID());
			}		
		}
		System.out.print("\n");
	}
	/**
	 * Display all the customers orders that have been dispatched 
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersDispatched(Database myDatabase)
	{
		System.out.println("List of customer orders that have been dispatched");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderIsDispatchedStatus() == true)
			{
				System.out.println("Customer Order ID: " + x.getCustomerOrderID());
			}
		}
		System.out.print("\n");
	}	
	/**
	 * Display all the customers orders that are awaiting picking 
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersAwaitingPicking(Database myDatabase)
	{
		System.out.println("List of customer orders that still need to be picked");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderPickedStatus() == false)
			{
				System.out.println("Customer Order ID: " + x.getCustomerOrderID());
			}
		}
		System.out.print("\n");
	}
	/**
	 * Display all the customers orders that have been picked.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016
	 */
	public void viewCustomerOrdersPicked(Database myDatabase)
	{
		System.out.println("List of customer orders that have been picked");
		for(CustomerOrder x : myDatabase.customerOrderTable)
		{
			if(x.getCustomerOrderPickedStatus() == true)
			{
				System.out.println("Customer Order ID: " + x.getCustomerOrderID());
			}
		}
		System.out.print("\n");
	}
	/**
	 * Displays the purachse orders that are awaiting delivery 
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 21/12/2016
	 */
	public void viewPurchaseOrdersAwaitingDelivery(Database myDatabase)
	{
		System.out.println("List of purchase order that have not been delivered yet.");
		for(PurchaseOrder x : myDatabase.purchaseOrderTable)
		{
			if(x.getPurchaseOrderDeliveryStatus() == false)
			{
				System.out.println("Purchase Order ID: " + x.getPurchaseOrderID());
			}
		}
		System.out.print("\n");
	}	
	//TODO.	
	/**
	 * Returns the best path for the salesman to take in the warehouse. 
	 * @author 
	 * @version 1.0
	 * @since 
	 */
	public ArrayList<Point> calculateBestPickingPath(CustomerOrder orderToCalculate, ArrayList<Point> pickingPath)
	{	
		Point initBase = new Point(0,0);//This is the location of the start point in the warehouse.
		Point nextLocation = new Point(0,0);
		for(Item x : orderToCalculate.itemsInOrder)
		{
			if(x.getItemLocationInWarehouse().getX() > nextLocation.getX() && x.getItemLocationInWarehouse().getY() > nextLocation.getY())
			{
				nextLocation = x.getItemLocationInWarehouse();
				System.out.println("New base location is: " + nextLocation);
			}
		}		
		return pickingPath;
		
	}
}
