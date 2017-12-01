package genericMethods;

import java.util.Arrays;

public class GenericMethods {	
	/**
	 * Check if two objects are equal
	 * @param object1 the first object
	 * @param object2 the second object
	 * @return true if the objects are equal (according to the equals() method)
	 */
	public static <T> boolean equals(T object1,T object2) {
		if (object1==null) {
			return object2==null;
		} else {
			return object1.equals(object2);
		}
	}
	
	public static <T> void
	swap(T[]array,int i, int j) 
	{		
		T obj1 = array[i];
		T obj2 = array[j];
		array[i] = obj2;  // 
		array[j] =obj1;
		}
	
	public static void main(String[] args)
	{
		Object[] ints = {1, 2, 3, 4, 5};   //array list that is going to be swapped
		swap(ints, 0, 3);  // defining the index number in the array that are going to be swapped
		System.out.println(Arrays.toString(ints));		
	}
}
