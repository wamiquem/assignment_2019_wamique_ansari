package restaurant;

public class RiceBowl extends Composite{
	/**
     * Constructor for this class
     * @param desc Description of the object
     */
	public RiceBowl(String desc) {
		super(desc);
	}
	
	/**
     * Function to print object description and call printDetails of child components
     */
	public void printDetails() {
        System.out.println( " " + desc);
        for (Component component  : components)
        {
        	component.printDetails();
        }
    }
}
