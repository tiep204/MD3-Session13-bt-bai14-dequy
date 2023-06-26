public class Main {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Không tìm thấy " + target + " trong mảng.");
        } else {
            System.out.println("Tìm thấy " + target + " tại vị trí " + result + " trong mảng.");
        }
    }
}