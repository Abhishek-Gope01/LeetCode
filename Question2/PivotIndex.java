package Question2;

public class PivotIndex {
    private static int pivotIndex(int[] arr){
        int totalSum = 0;
        for(Integer i : arr) totalSum += i;

        int leftsum = 0;
        for (int i = 0; i < arr.length; i++){
            int rightSum = totalSum - arr[i] - leftsum;
            if (rightSum == leftsum) return i;
            leftsum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
}
