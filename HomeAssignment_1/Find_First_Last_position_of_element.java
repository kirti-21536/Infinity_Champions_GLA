public class Find_First_Last_position_of_element{
    public static void main(String args[]){
        int nums[]={5,7,7,8,8,10};
        int target=8;
        //int ans[]=linear_Search(nums,target);
        int f=find_First(nums,target);
        int l=find_Last(nums,target);
        int ans[]={f,l};
        for(int i:ans){
            System.out.print(i+" ");
        }
    }

    //optimized approach with time complexity of
    // O(log n) and space complexity O(1)
    //since the array is sorted ,we use binary search
    public static int find_First(int nums[],int target){ 
        int lo=0,hi=nums.length-1,ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                hi=mid-1; //leftmost occurence of element ke liye
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }

    public static int find_Last(int nums[],int target){
        int lo=0,hi=nums.length-1,ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                lo=mid+1; //rightmost occurence of element ke liye
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }

    //brute force approach with time complexity of
    // O(n) and space complexity O(1)
//     public static int[] linear_Search(int nums[],int target){
//         int arr[]={-1,-1};
//         int n= nums.length;
//         int occ=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==target){
//             arr[0]=i;
//             occ=i;
//             break;
//             }
//         }
//         for(int j=occ;j<n;j++){
//             if(nums[j]==target){
//                 arr[1]=j;
//             }
//     }
//         return arr; 
// }
}