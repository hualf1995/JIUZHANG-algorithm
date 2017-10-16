public class Solution {
    /*
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int start = 0, end = A.length-1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
                return mid;
            }
            else if(A[mid] > A[mid-1] && A[mid] < A[mid+1]){
                start = mid;
            }
            else if(A[mid] < A[mid-1] && A[mid] > A[mid+1]){
                end = mid;
            }
            else{    // start = mid is also OK
                end = mid;
            }
        }
        if(A[start] > A[start-1] && A[start] > A[start+1]){
            return start;
        }
        if(A[end] > A[end-1] && A[end] > A[end+1]){
            return end;
        }
        return -1;
    }
}
