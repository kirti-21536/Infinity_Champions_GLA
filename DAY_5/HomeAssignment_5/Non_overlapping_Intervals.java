package DAY_5.HomeAssignment_5;

import java.util.Arrays;

public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));

    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int remove=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                remove++;
            }
            else{
                end=intervals[i][1];
            }
        }
        return remove;
    }

    
}
