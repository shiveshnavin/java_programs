package in.hoptec;

//https://leetcode.com/problems/search-a-2d-matrix/
public class BinarySearch2DMatrixSearch
{

    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.println(searchMatrix(mat,45));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++){
            if(bs(matrix[i],target)>-1){
                return true;
            }
        }
        return false;

    }

    public static int bs(int [] arr,int e){

        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == e){
                return mid;
            }
            else if(arr[mid] < e ){
                l = mid + 1;
            }
            else  {
                r = mid - 1;
            }
        }

        return -1;

    }
}
