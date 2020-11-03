package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        if (data == null || data.length == 0)
            return -1;

        return binarySearchHelper(data, target, 0, data.length-1);  // place holder
    }

    public static int binarySearchHelper(int[] data, int target, int start, int end) {
        int mid = (start + end)/2;

        if (data[mid] == target) {
            return mid;
        }

        if (start == end) {
            return -1;
        }

        if (target > data[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }

        return binarySearchHelper(data, target, start, end);

    }
}
