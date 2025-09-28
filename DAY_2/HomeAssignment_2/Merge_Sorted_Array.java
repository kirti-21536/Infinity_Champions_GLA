package DAY_2.HomeAssignment_2;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        
        int nums1[]={1,2,3,0,0,0};
        int m=3;
        int nums2[]={2,5,6};
        int n=3;
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[idx--]=nums1[i--];
            }else{
                nums1[idx--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[idx--]=nums2[j--];
        } 
        for(int k=0;k<m+n;k++){
            System.out.print(nums1[k]+" ");
        }  
        
    }
    
}
