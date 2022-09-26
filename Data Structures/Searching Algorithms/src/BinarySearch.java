
class Binary{
	Binary(int n){
		int a[] = new int[] {24,47,59,87,98,127,264,358,463,537};
		int low = 0;
		int high = 9;
		boolean isFound = false;
		while(low <= high) {
			int mid = (high + low)/2;
			if(a[mid] == n) {
				System.out.println("The Number is : " + a[mid]);
				System.out.println("Index is : " + mid);
				isFound = true;
				break;
			}
			else if(a[mid] < n) {
				low = mid + 1;
			}
			else {
				// This is like else if (a[mid] > n){ // code }
				high = mid - 1;
			}
		}
		if(!isFound) {
			System.out.println(n + " is not found.");
		}
	}
}
/*
 * Here we used binary search.
 * If we want use binary search, then our array must be sorted.
 * Time Complexity : O(log(n))
 * Best case : O(1)
*/
public class BinarySearch {

	public static void main(String[] args) {
		Binary B = new Binary(264);
		
	}

}
