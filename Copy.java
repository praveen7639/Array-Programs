import java.util.*;
class Copy{
       public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number of elements you want in array1:");
             int n1=sc.nextInt();
             int []array1=new int[n1];
            
             int array2[]=new int[n1];

             for(int i=0;i<n1;i++){
                    array1[i]=sc.nextInt;
                    array2[i]=array1[i];
             }

             //printing

             for(int i=0;i<array2.length();i++){
                  System.out.print(array2[i]);
             }
       }
}