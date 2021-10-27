package homework;

public class HW7TestOrder {

	public static void main(String[] args) {
	
		// Declaring 3 objects
		Order o1 = new Order("One PC");
		Order o2 = new Order("Two Cars");
		Order o3 = new Order("Three Baskets");
		
		// Order 1 information
		o1.cancel();
		
		// Order 2 information
		o2.setShippingAddress("91 Oliverio Drive");
		o2.setBillingAddress("255 Counts Lane");
		o2.setPhoneNumber("(620)-562-5212");
		o2.ship();
		
		// Order 3 information
		o3.setShippingAddress("123 Ave Street");
		o3.setBillingAddress("67 North Lane");
		o3.setPhoneNumber("(999)-999-9999");
		
		// Printing the second orders name
		System.out.println("Order 2's Name: " + o2.getOrderName());
		
		// Printing the third orders name
		System.out.println("Order 3's Date: " + o3.getDate());
		
		// Printing the second orders status
		System.out.println("Order 2's Status: " + o2.getStatus());
		
		// Printing the third orders shipping address
		System.out.println("Order 3's Shipping Address: " + o3.getShippingAddress());
		
		// Printing the second orders billing address
		System.out.println("Order 2's Billing Address: " + o2.getBillingAddress());
		
		// Printing the third orders phone number
		System.out.println("Order 3's Number: " + o3.getPhoneNumber());
		
		// Printing the total number of orders
		System.out.println("The number of orders is: " + o1.getTotalOrder());
		
		// Printing the first orders information
		System.out.println(o1.toString());
		
		// Printing the second orders information
		System.out.println(o2.toString());
		
		// Printing the third orders information
		System.out.println(o3.toString());
	}

}
