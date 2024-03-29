import java.util.*;

class Largest{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the size of array:");
               int n =sc.nextInt();
               int arr[]=new int[n];

               for(int i=0;i<n;i++){
                  
                   arr[i]=sc.nextInt();
               }

               int max=arr[0];
               
                  for(int x:arr){
                      if(max < x){
                           max=x;
                      }
                  }
                  System.out.println("Largest element is : " + max);
       }
}