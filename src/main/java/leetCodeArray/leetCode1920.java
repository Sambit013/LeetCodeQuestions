package leetCodeArray;
//1920. Build Array from Permutation

public class leetCode1920 {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;

    }
}
