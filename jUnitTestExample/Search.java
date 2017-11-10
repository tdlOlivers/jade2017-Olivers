package jUnitTestExample;
public class Search {
	public static int find(int x, int[] a) {
		return binarySearch(x, a, 0, a.length-1);
    }

	public static int binarySearch(int x, int[] a, int start, int end) {
		if (a.length < 1) {
			return -1;
		}
		int mid = (start+end) / 2;
		if(start==end && x!= a[mid]) {
			return -1;
		}
		
		if (x < a[mid]) {
			return binarySearch(x, a, start, mid-1);
		} else if (x > a[mid]) {
			return binarySearch(x, a, mid+1, end);
		} else {
			return mid;
		}
	}
}
