import java.util.*;

class Frequency{

        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the array Size");
                 int n=sc.nextInt();
                 int[] arr=new int[n];

                 for(int i=0;i<n;i++){
                     arr[i]=sc.nextInt();
                 }
            //      Arrays.sort(arr);
                 count(arr,n);
        }

        public static void count(int[] arr,int n){
               for(int i=0;i<n;i++){
                     int freq=1;
                     for(int j=i+1;j<n;j++){
                           if(arr[i]==arr[j]){
                           freq++;
                              arr[j]=0;
                           }
                     }
                      if(arr[i]!=0)
                     System.out.println(arr[i]+":"+freq);
               }
        }
}