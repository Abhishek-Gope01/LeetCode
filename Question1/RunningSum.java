import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) { 
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = new int[5];
        ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}
