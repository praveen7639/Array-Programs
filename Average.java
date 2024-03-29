import java.util.*;

class Average{
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
              System.out.println("Enter the array length");
              int len=sc.nextInt();
              int[] arr=new int[len];
              double sum=0;

              for(int i=0;i<len;i++){
                     arr[i]=sc.nextInt();
              }

              for(int x:arr){
                    sum+=x;
              }

              double avg=sum/len;

              System.out.println(avg);
       }
}