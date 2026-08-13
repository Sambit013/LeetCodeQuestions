package leetCodeArray;
//724. Find Pivot Index

public class leetCode724 {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int pivot = -1;

        sumLeft[0] = 0;
        sumRight[nums.length - 1] = 0;

        for(int i = 1; i < nums.length; i++){
            sumLeft[i] = nums[i - 1] + sumLeft[i - 1];
        }
        for(int j = nums.length - 1 - 1; j >= 0; j--){
            sumRight[j] = nums[j + 1] +  sumRight[j + 1];
        }

        for(int k = 0; k < nums.length; k++){
            if(sumLeft[k] == sumRight[k]){
                pivot = k;
                break;
            }
        }
        return pivot;

    }
}
