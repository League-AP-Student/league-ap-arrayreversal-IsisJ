


public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		/* code goes here */
		int[] tempArr = new int[arr.length];
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = arr[(arr.length-1)-i];
		}
		for(int i=0; i<tempArr.length; i++)
			arr[i] = tempArr[i];
		}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		/* code goes here */
		for(int i=0; i<mat.length; i++) {
			ArrayUtil.reverseArray(mat[i]);
			
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		/* code goes here */
		reverseAllRows();
		for(int row=0; row<=mat.length/2; row++) {
			int[] temp = mat[row];
			mat[row] = mat[mat.length-1-row];
			mat[mat.length-1-row] = temp;
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
