package Day_3_questions;

import java.util.Scanner;

public class Spiral_traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int minr=0;
        int maxr=m-1;
        int minc=0;
        int maxc=n-1;
        int c=0;
        int te=m*n;
        while(c<te){
           for(int k=minc;k<=maxc&&c<te;k++){
            System.out.print(matrix[minr][k]+" ");
            c++;
           }
           minr++;
           for(int k=minr;k<=maxr&&c<te;k++){
                System.out.print(matrix[k][maxc]+" ");
                c++;
           }
           maxc--;
           
           for(int k=maxc;k>=minc&&c<te;k--){
            System.out.print(matrix[maxr][k]+" ");
            c++;
           }
           maxr--;
           for(int k=maxr;k>=minr &&c<te;k++){
            System.out.print(matrix[k][minc]+" ");
            c++;
           }
           minc++;

        }

        }
        
    }

