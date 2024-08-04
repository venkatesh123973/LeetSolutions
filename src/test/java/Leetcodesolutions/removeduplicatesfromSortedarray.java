package Leetcodesolutions;

public class removeduplicatesfromSortedarray {

    public static int duplicate(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        int[] nums = {1,2,2,3,4,5,5,6};
        System.out.println(duplicate(nums));

    }
}
