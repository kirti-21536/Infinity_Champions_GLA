package DAY_2.HomeAssignment_2;

import java.util.*;
public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int nums[] ={3,2,1,5,6,4};
        int k=2;
        // Arrays.sort(nums);
        // System.out.println(nums[nums.length-k]);

        //using priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (pq.size() == k) {
                if (pq.peek() < num) {
                    pq.poll();
                    pq.add(num);
                }
            }
            else pq.add(num);
        }
        System.out.println(pq.peek());
    }
        
    }
    

