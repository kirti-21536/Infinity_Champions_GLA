package Day_3_questions;

public class Richest_Customer_wealth {
    public static void main(String[] args) {
       int accounts[][] = {{1,2,3},{3,2,1}};
       int maxsum=0;
        for(int i=0;i<accounts.length;i++){
            int arr[]=accounts[i];
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
            }
            maxsum=Math.max(sum,maxsum);

        }
        System.out.println(maxsum);
    }
    
}
