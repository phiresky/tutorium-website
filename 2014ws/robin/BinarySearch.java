public class BinarySearch {
	static <T extends Comparable<T>> T binarySearch(T[] arr, T find) {
		return binarySearch(arr, 0, arr.length, find);
	}

	static <T extends Comparable<T>> T binarySearch(T[] arr, int start, int end, T find) {
		int mid = (end - start) / 2;
		if (end == start)
			return null;
		int compared = find.compareTo(arr[mid]);
		if (compared == 0)
			return arr[mid];
		if (compared < 0)
			return binarySearch(arr, start, mid, find);
		if (compared > 0)
			return binarySearch(arr, mid, end, find);
		throw new IllegalStateException("this should never happen");
	}
	
	public static void main(String[] args) {
		System.out.println(binarySearch(new String[]{"a","b","c"},"b"));
	}
}