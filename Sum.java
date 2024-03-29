import java.util.*;

class Sum{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the size of array:");
               int n =sc.nextInt();
               int arr[]=new int[n];
               int sum=0;

               for(int i=0;i<n;i++){
                  
                   arr[i]=sc.nextInt();
               }
                 for(int x : arr){
                       sum+=x;
                 }
                 System.out.println(sum);
       }
}