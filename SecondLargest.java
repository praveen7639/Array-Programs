import java.util.*;

class SecondLargest{

       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int arr[]=new int[n];

               for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
               }

               int max=arr[0];

               for(int x :arr){
                     if(x > max){
                         max=x;
                     }
               }

               int second=Integer.MIN_VALUE;

               for(int x : arr){
                    if(x>second && x!=max){
                         second=x;
                    }
               }

               System.out.print("second largest Element : "+second );
       }
}