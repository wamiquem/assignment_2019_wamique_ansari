package restaurant;

public class Meat extends Leaf{
	private String option;
	
	/**
     * Constructor for this class
     * @param desc Description of the object
     */
	public Meat(String desc) {
		super(desc);
	}
	
	/**
     * Function to set option for the object
     */
	public void setOption( String option )
    {
        this.option = option ;
    }
	
	/**
     * Function to get option of the object
     * @return option of the object
     */
	public String getDetails() 
    {
        return option ;
    }
}