import java.util.*;

 public class Search{
       public static void main(String[] args){
                int a[]={1,4,5,67,984,2};
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                int n=sc.nextInt();
                find(n,a);
       }

       public static void find(int num,int a[]){
               for(int i=0;i<a.length;i++){
                     if(a[i]==num){
                          System.out.print("present");
                          break;
                     }
                    
               }
               
       }
 }