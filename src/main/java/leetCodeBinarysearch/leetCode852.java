package leetCodeBinarysearch;

//852. Peak Index in a Mountain Array a
public class leetCode852 {
    public static int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left;

    }

    public static void main(String[] args) {
        int val = leetCode852.peakIndexInMountainArray(new int[]{0, 10, 5, 2, 0});
        System.out.println(val);

    }

}