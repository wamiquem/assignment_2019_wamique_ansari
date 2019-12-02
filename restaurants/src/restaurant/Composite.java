package restaurant;

import java.util.ArrayList;

public class Composite implements Component{
	
	protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String desc ;
    
    /**
     * Constructor for this class
     * @param desc Description of the composite object
     */
    public Composite ( String desc ){
        this.desc = desc ;
    }

    /**
     * Function to print object description and call printDetails of child components
     */
	@Override
	public void printDetails() {
		System.out.println( this.desc );
        for (Component component  : components){
        	component.printDetails();
        }
	}

	/**
     * Function to add child objects
     */
	@Override
	public void addChild(Component child) {
		components.add( child ) ;
	}

}
