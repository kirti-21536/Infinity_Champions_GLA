package Day_3_questions;

import java.util.Scanner;

public class Columnwise_traversal {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];

        //inputting an 2D array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //columnwise traversal
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[j][i]+" ");
            }
        System.out.println();
    }
        
    }
        
    }
    

