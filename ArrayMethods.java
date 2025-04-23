/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: <Pseudocode for selection sort here>
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
/**
 * Returns arrays contents in String form
 * 
 * @param a int [] of values, ust be >= 1 length
 * 
 * @return array contents in String, seperated by camas
 */
  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
    String result = "{ " + a[0];
    //conctenate on each int value
    for(int i = 1; i < a.length; i++) 
    {
      result += ", " + a[i];
    }
    result += " }";

    return result;
  }
  /**
   * Swaps two values in the array at given indices
   * 
   * @param array int[] that will be modified
   * @param a index of first element to swap (must be valid index)
   * @param b indes of second element to swap (must be valid index)
   */
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
  /**
   * Finds index of min value of an array from start index
   * 
   * @param array int [] to search
   * @param startIndex index to begin search for min at
   * 
   * @return index of the min vlaue, from startIndex to end of array
   */
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex; i < array.length; i++) 
    {
      if(minValue > array[i])
      {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {
   for(int i = 0; i < array.length/2; i++) 
  {
    ArrayMethods.swap(array, i, array.length-1-i);
  }
}
	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {
    for(int i = 0; i < array.length-1; i++)
    {
    int indexMinValue = ArrayMethods.indexOfMin(array, i);
    ArrayMethods.swap(array, i, indexMinValue);
    }

  }

}