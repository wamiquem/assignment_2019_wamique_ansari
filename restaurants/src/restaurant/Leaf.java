package restaurant;

public class Leaf implements Component{
	private String desc ;
	
	/**
     * Constructor for this class
     * @param desc Description of the leaf object
     */
	public Leaf(String desc) {
		this.desc = desc ;
	}

	/**
     * Function to print object description and call getDetails method for the object
     */
	@Override
	public void printDetails() {
		System.out.println( "   " + this.desc + " - " + getDetails()) ;
	}

	/**
     * As leaf has no children, no implementation for this method is needed
     */
	@Override
	public void addChild(Component c) {
		// no implementation
	}
	
	/**
     * As subclasses overrides this method, no implementation for this method is needed
     * @return null
     */
	public String getDetails() {
		//no implementation
		return null;
	}
	
	/**
     * Function to get description of leaf object
     * @return description of leaf object
     */
	public String getDesc() {
		return this.desc;
	}
}
