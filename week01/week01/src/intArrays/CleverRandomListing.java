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
        for(int x = 0; x < getArray().length; x++) 
        {
            int i = getRandomIndex(); 
            int v = getArray() [x]; 
            getArray() [x] = getArray() [i];
            getArray() [i] = v;
        }
    }

    public static void main(String[] args) 
    {
        RandomListing count = new CleverRandomListing(1000000); 
        System.out.println(Arrays.toString(count.getArray()));
    }

} // End of class CleverRandomCount