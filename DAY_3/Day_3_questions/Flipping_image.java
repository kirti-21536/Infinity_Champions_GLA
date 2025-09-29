package Day_3_questions;

public class Flipping_image {
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<image.length;i++){
            int arr[]=image[i];
            int m=0;
            int n=image[0].length-1;
            while(m<=n){
                int temp=arr[m];
                arr[m]=arr[n];
                arr[n]=temp;
                m++;
                n--;
            }

        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
        System.out.println();
    }
        
    }
    
}
