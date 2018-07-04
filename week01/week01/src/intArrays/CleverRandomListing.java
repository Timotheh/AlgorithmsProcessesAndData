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

    public CleverRandomListing(int size) 
    {
        super(size);
    }


    protected void randomise()
    {
        for(int i = 0; i < getArray().length; i++) 
        {
            int randomIndex = getRandomIndex(); 
            int array = getArray() [i]; 
            getArray() [i] = getArray() [randomIndex];
            getArray() [randomIndex] = array;
        }
    }

    public static void main(String[] args) 
    {
        RandomListing count = new CleverRandomListing(1000000); 
        System.out.println(Arrays.toString(count.getArray()));
    }

} // End of class CleverRandomCount