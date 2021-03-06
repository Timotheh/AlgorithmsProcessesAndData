package intArrays;

import java.util.Arrays; // in order to be able to use the fill(...) method
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version September 2017
 */

public class SimpleRandomListing extends RandomListing
{
    /**
     * Constructor
     */
    public SimpleRandomListing(int size) {
        super(size); // calls the constructor "size"
        }
        /**
     * Randomise the array
     */
    protected void randomise() {
        int[] copy = new int[getArray().length];
        int randomIndex;
        // used to indicate if elements have been used
        Boolean[] used = new Boolean[getArray().length];
        Arrays.fill(used,false);
        for (int index = 0; index < getArray().length; index++) {// if the index od smaller than the total size of the array list then continue
        	do {
                randomIndex = getRandomIndex(); //declares the getRandonIndex method as randomindex to be called 
            } while (used[randomIndex]);
            copy[index] = getArray()[randomIndex];
            used[randomIndex] = true;
        }
        for (int index = 0; index < getArray().length; index++) {// if the index is smaller than the array then the method gets the size of the array and sets copy as the size
            getArray()[index] = copy[index];
        }
    }
    
    public static void main(String[] args) {
    	RandomListing count = new SimpleRandomListing(1000000);
    	System.out.println(Arrays.toString(count.getArray()));
    }

} // End of class SimpleRandomCount