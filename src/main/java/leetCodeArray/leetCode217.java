package leetCodeArray;
//217. Contains Duplicate

import java.util.HashMap;

public class leetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> checkValues = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(checkValues.containsKey(nums[i])){
                return true;
            }else{
                checkValues.put(nums[i], i);
            }
        }
        return false;
    }
}