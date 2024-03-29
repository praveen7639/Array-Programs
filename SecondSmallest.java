import java.util.*;

class SecondSmallest{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the size of array:");
               int n =sc.nextInt();
               int arr[]=new int[n];
             
               //taking input

               for(int i=0;i<n;i++){
                  
                   arr[i]=sc.nextInt();
               }

                  int min=arr[0];

                  //finding smallest
                 for(int x : arr){
                      if(min > x){
                           min =x;
                      }
                 }
                 //second small finding

                 int second=Integer.MAX_VALUE;

                  for(int a:arr){
                      if(a<second && a!=min){
                           second=a;
                      }
                  }

                 System.out.println(second);
       }
}