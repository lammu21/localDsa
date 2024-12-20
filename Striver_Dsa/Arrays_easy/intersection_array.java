import java.util.ArrayList;

public class intersection_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
    }
    
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer> result = new ArrayList<>();
		int i=0;
		int j=0;
		while (i<n&&j<m) {
			if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else {
                result.add(arr1.get(i));
				i++;
				j++;
			}
		
			
		}
			return result;
	}
}
