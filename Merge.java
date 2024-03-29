import java.util.*;
class Merge{
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int arr1[]={1,2,3,5,7};
            int arr2[]={7,9,6,2};

            int n1=arr1.length;
            int n2=arr2.length;

            int c[]=new int[n1+n2];

            for(int i=0;i<n1;i++){
                c[i]=arr1[i];
            }
            for(int j=0;j<n2;j++){
                c[n1+j]=arr2[j];
            }

            for(int a : c){
                System.out.print(a+" ");
            }
    }
}