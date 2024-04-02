public class Lecture_35 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
        int target = 13; 
        int result = binarySearch(array, target);
        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target)
                return mid;
            
            if (array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }return -1;
    }
}
