package arraySorter;

class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int array[], int low, int high)
    {
        int pivot = array[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or equal to pivot number
            if (array[j] <= pivot)
            {
                i++;
 
                //  this swaps array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
 
        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
    	//this is the array that needs sorting 
        int arr[] = {10, 7, 8, 9, 1, 5, 46, 60, 4, 3, 1002, 22, 123};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
 
        //this prints out the sorted a
        System.out.println("Array is now sorted!!");
        printArray(arr);
    }
}