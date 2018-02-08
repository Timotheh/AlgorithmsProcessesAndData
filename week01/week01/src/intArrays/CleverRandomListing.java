package intArrays;

import java.util.Arrays; // in order to be able to use the fill(...) method
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version September 2017
 */

public class CleverRandomListing extends RandomListing
{
    /**
     * Constructor
     */
    public CleverRandomListing(int size) 
    {
        super(size); // calls the constructer "size"
        randomise();
    }
     
    protected void randomise() {
        int[] copy = new int[getArray().length];
        int randomIndex;
        // used to indicate if elements have been used
        Boolean[] used = new Boolean[getArray().length];
        Arrays.fill(used,false);
        for (int index = 0; index < getArray().length; index++) // if the index od smaller than the total size of the array list then contiune
        {
        	if(index)
        	{
        		
        	}
        }
        	
        for (int index = 0; index < getArray().length; index++) {// if the index is smaller than the array then the method gets the size of the array and sets copy as the size
            getArray()[index] = copy[index];
        }
    }
    
    public static void main(String[] args) {
    	RandomListing count = new CleverRandomListing(1000000);
    	System.out.println(Arrays.toString(count.getArray()));
    }

} // End of class SimpleRandomCount