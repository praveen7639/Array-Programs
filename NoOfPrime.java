import java.util.*;
 
 class NoOfPrime{

public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the array Size");
              int n=sc.nextInt();
              int arr[] =new int[n];

              for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
              }

        int count=0;
              for(int i=0;i<n;i++){
                      if(isPrime(arr[i])){
                        //    System.out.print(arr[i]);
                           count++;
                      }                      
              }
              System.out.print(count);
}

        public static boolean isPrime(int n){
                        if(n<2){
                               return false;
                        }
                      for(int i=2;i<n;i++){
                             if( n%i==0){
                                 return false;
                             }
                      }
                      return true;
            }
 }