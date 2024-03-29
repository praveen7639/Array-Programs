import java.util.*;

class CountingOddEven{
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
             System.out.println("Enter the no of element");
             int n=sc.nextInt();
             //creating an array to store elements
              int arr[]=new int[n];

             for(int i=0;i<n;i++){
                   arr[i]=sc.nextInt();
             }
             int even=0;int odd=0;
             for(int x :arr){
                   if(x%2==0){
                      even++;
                   }
                   else{
                     odd++;
                   }
             }
             System.out.println("Number of Even Elements are "+even);
              System.out.println("Number of Odd Elements are "+odd);
       }
}