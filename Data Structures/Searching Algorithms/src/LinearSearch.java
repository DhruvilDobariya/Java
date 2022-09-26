
class Linear{
	Linear(int n){
		int a[] = new int[] {27,46,4,25,98};
		int index = 0;
		for(int temp : a) {
			if(temp == n) {
				System.out.println("The Number is : " + temp);
				System.out.println("Index is : " + index);
				break;
			}
			index++;
		}
	}
}
/*
 * Here we use linear search.
 * Time complexity : O(n)
 * Best case : O(1)
*/
public class LinearSearch {

	public static void main(String[] args) {
		Linear L = new Linear(25);
	}

}
