package homework;

import java.util.Date;

public class Order {
	
	// Variables that track status
	public static final int ON_ORDER = 0;
	public static final int CANCELED = 1;
	public static final int SHIPPED = 2;
	
	// Store total number of order
	public static int totalOrder = 0;
	
	// Stores order name
	private String orderName;
	
	// Stores date
	private Date date;
	
	// Stores current status
	private int status;
	
	// Stores addresses
	private String shippingAddress;
	private String billingAddress;
	private String phoneNumber;
	
	// Base Constructor of Class
	public Order(String Name)
	{
		totalOrder++;
		orderName = Name;
		status = ON_ORDER;
		date = new Date();
	}
	
	// Canceling order
	public void cancel()
	{
		date = new Date();
		status = CANCELED;
	}
	
	// Confirming shipping
	public void ship()
	{
		date = new Date();
		status = SHIPPED;
	}
	
	// Setting a new shipping address
	public void setShippingAddress(String a)
	{
		shippingAddress = a;
	}
	
	// Setting a new phone number
	public void setPhoneNumber(String p)
	{
		phoneNumber = p;
	}
	
	// Setting a new billing address
	public void setBillingAddress(String add)
	{
		billingAddress = add;
	}
	
	// Returning total number of orders
	int getTotalOrder()
	{
		return totalOrder;
	}
	
	// Returning order name
	String getOrderName()
	{
		return orderName;
	}
	
	// Returning date
	Date getDate()
	{
		return date;
	}
	
	// Returning status
	int getStatus()
	{
		return status;
	}
	
	// Returning shipping address
	String getShippingAddress()
	{
		return shippingAddress;
	}
	
	// Returning phone number
	String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	// Returning billing address
	String getBillingAddress()
	{
		return billingAddress;
	}
	
	// Converting everything to strings
	public String toString()
	{
		String s = "Order Name: " + orderName + " |Date: " + date +	" |Status: " + status + 
				" |Shipping Address: " + shippingAddress + " |Billing Address: " + billingAddress +
				" |Phone Number: " + phoneNumber;
		return s;
	}
}
