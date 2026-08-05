package leetCodeQuickSort;

import java.util.Arrays;

//75. Sort Colors
public class leetCode75 {
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }

    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
        int temp = nums[high];
        nums[high] = nums[i + 1];
        nums[i + 1] = temp;

        return i + 1;
    }

    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        leetCode75 obj = new leetCode75();
        obj.sortColors(arr);
    }
}
