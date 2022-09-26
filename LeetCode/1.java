import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int i = 0;i < nums.length ;i++){
            for(int j = 0;j < nums.length ;j++){
                int temp = nums[i] + nums[j];
                if(temp == target){
                    a[0] = j;
                    a[1] = i;
                    break;
                }
            }
        }
        return a;
    }
}