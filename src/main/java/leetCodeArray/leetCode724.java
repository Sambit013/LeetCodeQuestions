package leetCodeArray;
//724. Find Pivot Index

public class leetCode724 {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;

        for(int num:nums){
            sumRight += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(sumLeft == sumRight - nums[i] - sumLeft){
                return i;
            }else{
                sumLeft += nums[i];
            }
        }
        return -1;
    }
}