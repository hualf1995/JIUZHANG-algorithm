public class Solution {
    /*
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if(A.length ==0) return -1;
        int start =0, end = A.length-1;
        while(start + 1< end){
            int mid = start + (end-start)/2;
            if(A[0] <= A[mid]){
                if(target >= A[0] && target <= A[mid]){
                    end = mid;
                }
                else if(target > A[mid] || target < A[0]){
                    start = mid;
                }
            }
            else{
                if(target >= A[mid] && target <= A[A.length-1]){
                    start = mid;
                } 
                else if(target >=A[0] || target < A[mid]){
                    end = mid;
                }
            }
        }
        if(target == A[start]) return start;
        if(target == A[end])    return end;
        return -1;
    }
}
