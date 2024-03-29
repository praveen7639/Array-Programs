import java.util.*;

class AscendingDescending{
        public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the number of elements you want in array:");
               int n=sc.nextInt();
               int []arr=new int[n];

               for(int i=0;i<n;i++){
                  arr[i]=sc.nextInt();
               }
               
                 int temp=0;

                    for(int i=0;i<n-1;i++){
                         for(int j=i+1;j<n/2;j++){
                            if(arr[i]>arr[j]){
                              temp=arr[j];
                              arr[j]=arr[i];
                              arr[i]=temp;
                            }
                          }

                    for(int j=n/2;j<n;j++){
                           if(arr[i]<arr[j]){
                              temp=arr[j];
                              arr[j]=arr[i];
                              arr[i]=temp;
                           }
                    }
               }

               //

               for(int i=0;i<n;i++){
                   System.out.print(arr[i]+",");
               }
        }
}