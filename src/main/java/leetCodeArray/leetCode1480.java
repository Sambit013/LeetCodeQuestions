package leetCodeArray;
//1480. Running Sum of 1d Array

public class leetCode1480 {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] newArray = new int[length];

        newArray[0] = nums[0];

        for (int i = 1; i < length; i++) {

            newArray[i] = nums[i] + newArray[i - 1];

        }

        return newArray;

    }
}
