
public class BubbleSort {

	public static int[] sort(int[] myArray) {
		for (int i = 0; i < myArray.length-1; i++)
		{
			for (int j = 0; j < myArray.length-2-i; j++)
			{
				if (myArray[j]>myArray[j+1])
					swap(myArray, j,j+1);
			}
			System.out.println();
		}
		return myArray;
	}
	
	public static void swap(int[] arr, int i1, int i2)
	{
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	

}
