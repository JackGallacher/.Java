/**
 * This class runs all the tests to demonstrate what we are expecting our application to do
 * 
 * @author Aaron Seymour and Jack Gallacher
 * @version 1.0
 * @since 14/12/2016 - 22/12/2016
 */
package testing;
import static org.junit.Assert.*;

import java.awt.Point;
import org.junit.Test;
import system.*;

public class WOTSJunit 
{
	//"OutputOrders" Testing
	
	@Test
	public void outPutDetailsTest() throws Exception
	{		
		//This creates the db
		Database myDatabase = new Database();
		
		//Populates db
		myDatabase.createItemDatabase();	
		
		//This saves the db to a string
		String myString = myDatabase.customerOrderTable.get(0).outputDetails();	
		
		//This displays what we expect 
		assertEquals("This customer order has not been checked out.This customer order has not been picked.This customer order has not been dispatched.", myString);
	}
	
	@Test
	public void printItemsInOrder() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		String myString = myDatabase.customerOrderTable.get(0).printItemsInOrder();
		
		assertEquals("ID: 4ID: Garden Chair (Porous)ID: 18ID: java.awt.Point[x=15,y=19]ID: 4ID: Garden Chair (Porous)ID: 18ID: java.awt.Point[x=15,y=19]ID: 5ID: Christmas Gnome (Non-Porous)ID: 98ID: java.awt.Point[x=15,y=31]ID: 6ID: Hammock (Non-Porous)ID: 8ID: java.awt.Point[x=18,y=32]", myString);		
	}
	
	//Item Testing
	
	@Test
	public void getItemNameTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		String myString = myDatabase.itemTable.get(0).getItemName();
		
		assertEquals("Funky Gnome (Porous)", myString);
	}
	@Test
	public void getItemTypeTest() 
	{		
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);			
		String itemType = testItem.getItemType();
				
		assertEquals("Test Type", itemType);	
	}
	@Test
	public void getItemCostTest() 
	{			
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);
		double itemCost = testItem.getItemCost();
						
		assertEquals(Double.toString(12.99), Double.toString(itemCost));
	}
	@Test
	public void getStockCountTest() 
	{				
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);
		int stockCount = testItem.getStockCount();
						
		assertEquals(56, stockCount);
	}
	
	public void setStockCountTest() 
	{				
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);
		testItem.setStockCount(150);
		
						
		assertEquals(150, testItem.getStockCount());
	}
	
	@Test
	public void getCanBeOrderedStatusTest() 
	{
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);												
		boolean canBeOrdered = testItem.getCanBeOrderedStatus();
						
		assertTrue(canBeOrdered);		
	}	
	@Test
	public void getItemLocationInWarehouseTest() 
	{
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);											
		Point locationInWarehouse = testItem.getItemLocationInWarehouse();
						
		assertEquals(new Point(23, 65), locationInWarehouse);	
	}
	@Test
	public void getIfItemHasPorouswareTest() 
	{
		Item testItem = new Item(007, "Test Item", "Test Type", 12.99, 56, true, true, 23, 65);											
		boolean requiresPorouswareApplied = testItem.getRequiresPorouswareApplied();
						
		assertTrue(requiresPorouswareApplied);	
	}	
	
	@Test
	public void printDetailsOfThisItemTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		String myString = myDatabase.itemTable.get(0).getItemName();
		
		assertEquals("Funky Gnome (Porous)", myString);
	}
	
	//CustomerOrder Tests
	@Test
	public void getCustomerOrderIDTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
		
		int myInt = myDatabase.customerOrderTable.get(0).getCustomerOrderID();
		
		assertEquals(myInt, 1);
	}
	@Test
	public void getCustomerOrderIsCheckedOutStatusTest() 
	{
		//This creates the db
		Database myDatabase = new Database();
				
		//Populates db
		myDatabase.createItemDatabase();	
				
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderCheckedOutStatus();	
				
		//This displays what we expect 
		assertEquals(myBool, false);
	}
	
	@Test
	public void setCustomerOrderIsCheckedOutStatusTest() 
	{
		//This creates the db
		Database myDatabase = new Database();
						
		//Populates db
		myDatabase.createItemDatabase();	
						
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderCheckedOutStatus();
						
		//This displays what we expect 
		assertEquals(myBool, false);
	}
	@Test
	public void getCustomerOrderIsPickedStatusTest() 
	{
		//This creates the db
		Database myDatabase = new Database();
						
		//Populates db
		myDatabase.createItemDatabase();	
						
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderPickedStatus();	
						
		//This displays what we expect 
		assertEquals(myBool, false);
	}	
	
	@Test
	public void setCustomerOrderIsPickedStatusTest() 
	{		
		//This creates the db
		Database myDatabase = new Database();
						
		//Populates db
		myDatabase.createItemDatabase();	
						
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderPickedStatus();	
						
		//This displays what we expect 
		assertEquals(myBool, false);
	}		
	@Test
	public void getCustomerOrderIsDispatchedStatusTest() 
	{
		//This creates the db
		Database myDatabase = new Database();
						
		//Populates db
		myDatabase.createItemDatabase();	
						
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderIsDispatchedStatus();	
						
		//This displays what we expect 
		assertEquals(myBool, false);
	}
	
	@Test
	public void setCustomerOrderIsDispatchedStatusTest() 
	{
		//This creates the db
		Database myDatabase = new Database();
						
		//Populates db
		myDatabase.createItemDatabase();	
						
		//This saves the db to a string
		boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderIsDispatchedStatus();	
						
		//This displays what we expect 
		assertEquals(myBool, false);
	}
	@Test
	public void getItemsInCustomerOrderTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		String myString = myDatabase.itemTable.get(0).getItemName();
		
		assertEquals("Funky Gnome (Porous)", myString);
	}	
	
	//PurchaseOrder Tests
	@Test
	public void getPurchaseOrderIDTest() 
	{
		
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
		
		int myInt = myDatabase.purchaseOrderTable.get(0).getPurchaseOrderID();
		assertEquals(myInt,1);
	}
	
	@Test
	public void replenishStockToItemStockCountTest() 
	{
		
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		int myInt = myDatabase.itemTable.get(0).getStockCount();
		
		assertEquals(27, myInt);
	}
	
	@Test
	public void setPurchaseOrderToDeliveredTest() 
	{
		//Create db
		Database myDatabase = new Database();
		
		//Populate db
		myDatabase.createItemDatabase();
		
		//Save db to boolean
		Boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderIsDispatchedStatus();
		
		assertEquals(false, myBool);
	}
	@Test
	public void getPurchaseOrderDeliveryStatusTest() 
	{
		
	}
	
	//Warehouse Tests
	@Test
	public void viewCustomerOrdersAwaitingCheckoutTest() 
	{
		//Create db
		Database myDatabase = new Database();
		
		//Populate db
		myDatabase.createItemDatabase();
		
		//Save db to boolean
		Boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderCheckedOutStatus();	

		assertEquals(false, myBool);
		
	}		
	@Test
	public void viewDispatchedCustomerOrdersTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
					
		Boolean myBool = myDatabase.customerOrderTable.get(0).getCustomerOrderIsDispatchedStatus();
		
		assertEquals(false, myBool);
	}
	@Test
	public void viewPurchaseOrdersAwaitingDeliveryTest() 
	{
		Database myDatabase = new Database();
		myDatabase.createItemDatabase();
			
		boolean myBool = myDatabase.purchaseOrderTable.get(0).getPurchaseOrderDeliveryStatus();
		
		assertEquals(false, myBool);
	}
	@Test  
	public void calculateBestPickingPathTest() 
	{
			
	}
}
