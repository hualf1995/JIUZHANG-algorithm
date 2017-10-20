public class Solution {
    /*
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int start = 0, end = nums.length-1;
        while(start + 1 < end){
            int mid = start + (end-start)/2;
            if(nums[mid] <= nums[nums.length-1]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        //double check
        if(nums[start] <= nums[nums.length-1]){
            return nums[start];
        }
        if(nums[end] <= nums[nums.length-1]){
            return nums[end];
        }
        return -1;
    }
}
