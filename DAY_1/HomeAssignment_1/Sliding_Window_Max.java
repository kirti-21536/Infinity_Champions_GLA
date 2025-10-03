import java.util.ArrayDeque;
import java.util.Deque;

public class Sliding_Window_Max {
    public static void main(String[] args) {
        int []nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = nums.length;
        int[] res = new int[n - k + 1];

        //optimal approach with TC of O(n)
        int ri=0; //result array ki indexing ke liye
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //remove numbers out of (range k)window size for that index
            if(!q.isEmpty()&& q.peek()==i-k){
                q.poll();
            }
            //remove smaller numbers in k range as they are of no use
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                res[ri++]=nums[q.peek()];
            }
        }

        // brute force approach with TC of O(n*k)
        // for (int i = 0; i <= n - k; i++) {
        //     int max = nums[i];
        //     for (int j = i; j < i + k; j++) {
        //         max = Math.max(max, nums[j]);
        //     }
        //     res[i] = max;
        // }

        //displaying result array
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
    }
    
}
