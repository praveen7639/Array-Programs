
import java.io.*;
class MissingNumber{

public static void printMissingElements(int arr[], int n)
{
	 int count=0;
	 
	 for(int i=arr[0];i<=arr[n-1];i++){
		   if(arr[count]==i){
			  count++;
		   }
		   else{
			 System.out.print(i+",");
		   }
	 }
}

public static void main (String[] args)
{

	int arr[] = { 6, 7, 10, 11, 13 };
	int n= arr.length;
	int temp=0;
	    
			   for(int i=0;i<n;i++){
				        for(int j=i+1; j<n;j++){
							   if(arr[i] > arr[j]){
								    temp =arr[i];
									arr[i]=arr[j];
									arr[j]=temp;
							   }
						} 
			   }
	printMissingElements(arr, n);
}
}


