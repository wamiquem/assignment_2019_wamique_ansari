package restaurant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Client {
	
	private static ArrayList<Order> orders = new ArrayList<Order>();
	private static String item = "Rice Bowl";
	private static int orderId = 1;
	
	public static void main(String[] args)
    {
		/* Order details - Past date is specified for generating report.
		 * Order Id is incremented for new orders. As order is created, printing the order details.
		 * Included 7 orders one by one
		 */
		Map <String, String> orderDetails = new HashMap<String, String>();
		Date date = new Date(System.currentTimeMillis() - 3600 * 1500);
		orderDetails.put("rice","White Rice");
		orderDetails.put("veg","");
		orderDetails.put("meat","Chicken");
		orderDetails.put("sauce","Spicy");
		orderDetails.put("cream","Sour Cream");
		orderDetails.put("salad","");
		Order order = new Order(orderId, date, item, orderDetails);
        Component createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
		date = new Date(System.currentTimeMillis() - 3600 * 1200);
		orderDetails.put("rice","White Rice");
		orderDetails.put("veg","Mixed Vegetables");
		orderDetails.put("meat","Beef");
		orderDetails.put("sauce","Spicy");
		orderDetails.put("cream","Sour Cream");
		orderDetails.put("salad","");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
		date = new Date(System.currentTimeMillis() - 3600 * 1000);
		orderDetails.put("rice","White Rice");
		orderDetails.put("veg","Mixed Vegetables");
		orderDetails.put("meat","Beef");
		orderDetails.put("sauce","Spicy");
		orderDetails.put("cream","Sour Cream");
		orderDetails.put("salad","");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
        date = new Date(System.currentTimeMillis() - 3600 * 900);
        orderDetails.put("rice","Brown Rice");
		orderDetails.put("veg","");
		orderDetails.put("meat","Beef");
		orderDetails.put("sauce","Sweet");
		orderDetails.put("cream","");
		orderDetails.put("salad","Guacamole");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
        date = new Date(System.currentTimeMillis() - 3600 * 800);
        orderDetails.put("rice","Brown Rice");
		orderDetails.put("veg","");
		orderDetails.put("meat","Chicken");
		orderDetails.put("sauce","Sweet");
		orderDetails.put("cream","");
		orderDetails.put("salad","Guacamole");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
        date = new Date(System.currentTimeMillis() - 3600 * 700);
        orderDetails.put("rice","White Rice");
		orderDetails.put("veg","Mixed Vegetables");
		orderDetails.put("meat","Chicken");
		orderDetails.put("sauce","Sweet");
		orderDetails.put("cream","");
		orderDetails.put("salad","Guacamole");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder() ;
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        orderDetails = new HashMap<String, String>();
        date = new Date(System.currentTimeMillis() - 3600 * 600);
        orderDetails.put("rice","Brown Rice");
		orderDetails.put("veg","Mixed Vegetables");
		orderDetails.put("meat","Beef");
		orderDetails.put("sauce","Spicy");
		orderDetails.put("cream","Sour Cream");
		orderDetails.put("salad","Guacamole");
		order = new Order(orderId, date, item, orderDetails);
		createdOrder = order.createOrder();
        orders.add(order);
        orderId++;
        createdOrder.printDetails();
        
        printReport(1);
    }
	
	/**
     * Function to print report header and then call actual report generator
     * @param hour time within which report needs to be generated
     */
	public static void printReport(int hour) {
		String timeUnit = "hour";
		if(hour>1) {
			timeUnit = "hours";
		}
		
		String out = "\n-------------------------------------------";
		out += "\n"+"Reports (Items ordered within last "+hour+" "+timeUnit+")";
		out += "\n"+"-------------------------------------------";
		System.out.println(out);
		printReport("", hour);
		printReport("Chicken", hour);
		printReport("Beef", hour);
		printReport("Mixed Vegetables", hour);
	}
	
	/**
     * Function to generate actual report
     * @param criteria option for which report needs to be generated
     * @param hour time within which report needs to be generated
     */
	public static void printReport(String criteria, int hour) {
		int count = 0;
		Date date = new Date(System.currentTimeMillis() - (60 * hour * 60 +1) * 1000);

		for(Order order: orders) {
			if(order.getDate().after(date)) {
				if(criteria.length() > 0) {
					if(order.getOrderDetails().values().contains(criteria)) {
						count++;
					}
				}else {
					count++;
				}
				
			}
		}	
		
		String out = "Total number of Rice Bowls";
		if(criteria.length() > 0) {
			out += " with "+criteria+ ": " + count;
		}else {
			out += ": " + count;
		}
		System.out.println(out);
	}
}