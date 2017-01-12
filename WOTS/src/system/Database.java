package system;
import java.util.ArrayList;

public class Database 
{	
	/**
	 * This creates and populate the mock database we can use to check that the methods within the program function as expected and fulfil their JUnit tests.
	 * @author Jack Gallacher
	 * @version 1.0
	 * @since 20/12/2016 
	 */
	//these are the ArrayLists we are going to use to simulate the items, customer order and purchase order within this program that will be moved to a datbase at some point.
	public ArrayList<Item> itemTable = new ArrayList<Item>();
	public ArrayList<CustomerOrder> customerOrderTable = new ArrayList<CustomerOrder>();
	public ArrayList<PurchaseOrder> purchaseOrderTable = new ArrayList<PurchaseOrder>();
	public void createItemDatabase()
	{
		//creates the items we are going to add to our mock database.
		Item item1 = new Item(1, "Funky Gnome (Porous)", "Gnome", 16.99, 27, true, true, 8, 19);
		Item item2 = new Item(2, "Funky Gnome (Non-Porous)", "Gnome", 12.99, 102, true, false, 9, 20);		
		Item item3 = new Item(3, "Garden Table (Non-Porous)", "Table", 49.99, 54, true, false, 38, 25);		
		Item item4 = new Item(4, "Garden Chair (Porous)", "Chair", 10.99, 18, true, true, 15, 19);		
		Item item5 = new Item(5, "Christmas Gnome (Non-Porous)", "Gnome", 12.99, 98, true, false, 15, 31);			
		Item item6 = new Item(6, "Hammock (Non-Porous)", "Hammock", 24.99, 8, true, false, 18, 32);	
		Item item7 = new Item(7, "Punk Gnome (Porous)", "Gnome", 14.99, 54, true, true, 17, 42);
		Item item8 = new Item(8, "Punk Gnome (Non-Porous)", "Gnome", 18.99, 11, true, false, 18, 43);	
		Item item9 = new Item(9, "Plant Pot (Porous)", "Container", 8.99, 44, true, true, 34, 38);	
		Item item10 = new Item(10, "Rake (Porous)", "Gardening Equipment", 8.99, 89, true, false, 7, 8);	
		Item item11 = new Item(11, "Summer Gnome (Non-Porous)", "Gnome", 13.99, 0, false, false, 44, 12);
		
		itemTable.add(item1);
		itemTable.add(item2);
		itemTable.add(item3);
		itemTable.add(item4);
		itemTable.add(item5);
		itemTable.add(item6);
		itemTable.add(item7);
		itemTable.add(item8);
		itemTable.add(item9);
		itemTable.add(item10);
		itemTable.add(item11);
		//System.out.println("Items have been added to the items ArrayList.");

		/*creates a few item lists that contain a selection of items to go into our mock customer orders. 
		 * Here, if we require more than one of the item we just add it to the list for the amount of the item we need.*/
		ArrayList<Item> corderItems1 = new ArrayList<Item>();		
		corderItems1.add(item4);
		corderItems1.add(item4);
		corderItems1.add(item5);
		corderItems1.add(item6);
		
		ArrayList<Item> corderItems2 = new ArrayList<Item>();
		corderItems2.add(item8);
		corderItems2.add(item9);
		corderItems2.add(item10);
		
		ArrayList<Item> corderItems3 = new ArrayList<Item>();
		corderItems3.add(item1);
		corderItems3.add(item2);
		corderItems3.add(item7);
		corderItems3.add(item7);
		corderItems3.add(item3);
		//System.out.println("Items have been added to lists for inclusion in customer orders.");
		
		//creates instances of mock customer orders we can use to test our program code.
		CustomerOrder customerOrder1 = new CustomerOrder(1, "23 Madeup Avenue", false, false, false, corderItems1);
		CustomerOrder customerOrder2 = new CustomerOrder(2, "27 False Drive", false, false, false, corderItems2);
		CustomerOrder customerOrder3 = new CustomerOrder(3, "67 Fake Close", false, false, false, corderItems3);
		//System.out.println("Customer orders have been created.");
		
		//Add the created customer orders to the customer order lists.
		customerOrderTable.add(customerOrder1);
		customerOrderTable.add(customerOrder2);
		customerOrderTable.add(customerOrder3);
		//System.out.println("Customer orders have been added to the customer order list.");
		
        /*Creates another list of items for use in the purchase order class. This list contains the stock level of each item in the purchase order. 
         * This will let us test the functionality of adding the stock level of items in the purchase order list to that of the main items list used for the customer orders.*/
		Item purchaseItem1 = new Item(1, "Funky Gnome (Porous)", "Gnome", 14.99, 4, true, true, 8, 19);
		Item purchaseItem2 = new Item(2, "Funky Gnome (Non-Porous)", "Gnome", 12.99, 6, true, false, 9, 20);		
		Item purchaseItem3 = new Item(3, "Garden Table (Non-Porous)", "Table", 49.99, 2, true, false, 38, 25);		
		Item purchaseItem4 = new Item(4, "Garden Chair (Porous)", "Chair", 10.99, 9, true, true, 15, 19);		
		Item purchaseItem5 = new Item(5, "Christmas Gnome (Non-Porous)", "Gnome", 12.99, 13, true, false, 15, 31);			
		Item purchaseItem6 = new Item(6, "Hammock (Non-Porous)", "Hammock", 24.99, 8, true, false, 18, 32);	
		Item purchaseItem7 = new Item(7, "Punk Gnome (Porous)", "Gnome", 14.99, 4, true, true, 17, 42);
		Item purchaseItem8 = new Item(8, "Punk Gnome (Non-Porous)", "Gnome", 18.99, 1, true, false, 18, 43);	
		Item purchaseItem9 = new Item(9, "Plant Pot (Porous)", "Container", 8.99, 5, true, true, 34, 38);	
		Item purchaseItem10 = new Item(10, "Rake (Porous)", "Gardening Equipment", 9.99, 9, true, false, 7, 8);	
		//System.out.println("Items for use in the purchase order (with amount of stock ordered) have been created.");
	
		//Creates a few lists with some items in so we can add them to our mock purchase orders.
		ArrayList<Item> porderItems1 = new ArrayList<Item>();		
		porderItems1.add(purchaseItem1);
		porderItems1.add(purchaseItem2);
		porderItems1.add(purchaseItem3);
		porderItems1.add(purchaseItem4);
		
		ArrayList<Item> porderItems2 = new ArrayList<Item>();
		porderItems2.add(purchaseItem5);
		porderItems2.add(purchaseItem6);
		porderItems2.add(purchaseItem7);
		
		ArrayList<Item> porderItems3 = new ArrayList<Item>();
		porderItems3.add(purchaseItem8);
		porderItems3.add(purchaseItem9);
		porderItems3.add(purchaseItem10);
		//System.out.println("ArrayLists of items to be used in the purchase order have been created.");
		
		//creates the purchase order we will used to test the code we have created for use with a database containing similar data.
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(1, false, porderItems1);
		PurchaseOrder purchaseOrder2 = new PurchaseOrder(2, false, porderItems2);
		PurchaseOrder purchaseOrder3 = new PurchaseOrder(3, false, porderItems3);
		//System.out.println("Purchase Orders have been created.");
			
		//adds the created purchase orders to the purchase order list.
		purchaseOrderTable.add(purchaseOrder1);
		purchaseOrderTable.add(purchaseOrder2);
		purchaseOrderTable.add(purchaseOrder3);
		//System.out.println("Purchase orders have been added to the customer order list.");
	}
}
