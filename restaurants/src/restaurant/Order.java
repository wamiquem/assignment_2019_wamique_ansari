package restaurant;
import java.util.Date;
import java.util.Map;

public class Order {
	private int orderId;
	private Date createdDate;
	private Map <String, String> orderDetails;
	private String item;
	
	/**
     * Constructor for this class
     * @param orderId Id of the order
     * @param createdDate Date and time at which the order is submitted
     * @param item Main item of the order(eg: Rice Bowl)
     * @param orderDetails details of the order
     */
	public Order(int orderId, Date createdDate, String item, Map <String, String> orderDetails) {
		this.orderId = orderId;
		this.createdDate = createdDate;
		this.orderDetails = orderDetails;
		this.item = item;
	}
	
	/**
     * Function to get date of the order
     * @return date of the order
     */
	public Date getDate() {
		return this.createdDate;
	}
	
	/**
     * Function to get id of the order
     * @return id of the order
     */
	public int getOrderId() {
		return this.orderId;
	}
	
	/**
     * Function to get details of the order
     * @return details of the order
     */
	public Map <String, String> getOrderDetails(){
		return this.orderDetails;
	}
	
	/**
     * Function to create order
     * @return order component
     */
	public Component createOrder() {
		String orderHeader = "";
		if(this.orderId>1) {
			orderHeader += "\n";
		}
		orderHeader += "Order # "+ String.valueOf(this.orderId);
		orderHeader += "\n" + "Date and Time: "+this.createdDate.toString();
		Composite order = new Composite( orderHeader);
		RiceBowl riceBowl = new RiceBowl(this.item) ;
		
		Rice rice = new Rice("Rice Option");
		String riceOption = this.orderDetails.get("rice");
		rice.setOption(riceOption);
		
		Vegetable veg = new Vegetable("Vegetable Option");
		String vegOption = this.orderDetails.get("veg");
		veg.setOption(vegOption);
		
		Meat meat = new Meat("Meat Option");
		String meatOption = this.orderDetails.get("meat");
		meat.setOption(meatOption);
		
		Sauce sauce = new Sauce("Sauce Option");
		String sauceOption = this.orderDetails.get("sauce");
		sauce.setOption(sauceOption);
		
		Cream cream = new Cream("Cream Option");
		String creamOption = this.orderDetails.get("cream");
		cream.setOption(creamOption);
		
		Salad salad = new Salad("Salad Option");
		String saladOption = this.orderDetails.get("salad");
		salad.setOption(saladOption);
		
		riceBowl.addChild(rice);
		riceBowl.addChild(veg);
		riceBowl.addChild(meat);
		riceBowl.addChild(sauce);
		riceBowl.addChild(cream);
		riceBowl.addChild(salad);
		
		order.addChild( riceBowl);
		
		return order;
	}
}
