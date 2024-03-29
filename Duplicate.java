import java.util.*;

class Duplicate{

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the array Size");
                 int n=sc.nextInt();
                 int[] arr=new int[n];

                 for(int i=0;i<n;i++){
                     arr[i]=sc.nextInt();
                 }
                 
                 count(arr,n);
        }

        public static void count(int[] arr,int n){
               for(int i=0;i<n;i++){
                     int freq=1;
                     for(int j=i+1;j<n;j++){
                         if(arr[i]==arr[j]){
                           freq++;
                         }
                     }
                    if(freq>1){ 
                          System.out.print(arr[i]);
                    }
               }
        }
}