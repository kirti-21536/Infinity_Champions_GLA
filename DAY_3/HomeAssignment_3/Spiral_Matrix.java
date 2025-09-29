package DAY_3.HomeAssignment_3;
import java.util.*;
public class Spiral_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ll=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int te=m*n;
        int c=0;
        int minr=0,maxr=m-1;
        int minc=0,maxc=n-1;
        while(c<te){
            //left to right
            for(int i=minc;i<=maxc &&c<te;i++){
                ll.add(matrix[minr][i]);
                c++;
            }
            minr++;

            //top to bottom
            for(int i=minr;i<=maxr&& c<te;i++){
                ll.add(matrix[i][maxc]);
                c++;
            }
            maxc--;

            //right to left
            for(int i=maxc;i>=minc &&c<te;i--){
                ll.add(matrix[maxr][i]);
                c++;
            }
            maxr--;

            //bottom to top
            for(int i=maxr;i>=minr &&c<te;i--){
                ll.add(matrix[i][minc]);
                c++;
            }
            minc++;
            
        }
        System.out.println(ll);
        
    }
    
}
