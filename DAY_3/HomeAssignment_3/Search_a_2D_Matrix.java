package HomeAssignment_3;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(search_element(matrix, target));
        
    }
    public static boolean search_element(int matrix[][],int target){
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            int arr[]=matrix[i];
            int lo=0;
            int hi=n-1;
            
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(arr[mid]<target){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return false;

    }
    
    
}
