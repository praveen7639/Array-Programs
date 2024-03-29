import java.util.*;

class Sum{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the size of array:");
               int n =sc.nextInt();
               int arr[]=new int[n];
               
                //input 
               for(int i=0;i<n;i++){
                  
                   arr[i]=sc.nextInt();
               }
                int temp=0;

                //sorting
                 for(int i=0;i<n;i++){
                      for(int j=i+1;j<n;j++){
                            if(arr[i] > arr[j]){
                                  temp=arr[i];
                                  arr[i]=arr[j];
                                  arr[j]=temp;
                            }
                      }
                 }
             
            //  Arrays.sort(arr);
                 //printing
  
                 for(int a:arr){
                     System.out.print(a+" ");
                 }
       }
}