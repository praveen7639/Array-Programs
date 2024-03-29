class RightRotate{
       public static void main(String[] args){
                int arr[]={7,6,4,2,1,9,4};
                int n=3;

                for(int i=0;i<n;i++){
                     int last=arr[arr.length-1];

                     for(int j=arr.length-1;j>0;j--){
                            arr[j]=arr[j-1];
                     }
                     arr[0]=last;
                }
                for (int x:arr){
                       System.out.print(x+",");
                }
       }
}