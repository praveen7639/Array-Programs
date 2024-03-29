import java.util.*;

class SortLeftBased{
       public static void main(String[] args){
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int[] arr=new int[n];

              for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
              }

               lexSort(arr);

               for(int i=0;i<n;i++){
                   System.out.print(arr[i]+",");
            }
            
       }

       public static void lexSort(int[] arr){
            String[] sarr=new String[arr.length];
            
            for(int i=0;i<sarr.length;i++){
                  sarr[i]=Integer.toString(arr[i]);
            }

            Arrays.sort(sarr);

             for (int i = 0; i < sarr.length; i++) {
             arr[i] = Integer.parseInt (sarr[sarr.length-1-i]);
  }

       }
}

