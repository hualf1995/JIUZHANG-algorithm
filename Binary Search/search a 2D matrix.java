public class Solution {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length == 0)  return false;
        int start = 0, end = matrix.length-1;
        
        while(start+1<end){
            int mid = start + (end-start)/2;
            if(matrix[mid][0] == target)  return true;
            else if(matrix[mid][0] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        int row= 0;
        if(matrix[start][0] <= target){
            row = start;
        }
        if(matrix[end][0] <= target){
            row = end;
        }
        
        start = 0;
        end = matrix[row].length-1;
        while(start+1<end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid] == target)  return true;
            else if(matrix[row][mid] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(matrix[row][start] == target){
            return true;
        }
        if(matrix[row][end] == target){
            return true;
        }
        return false;
    }
}
