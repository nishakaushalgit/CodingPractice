
class BubbleSort1 {
  static void bubbleSort(int arr[], int n) {
	  for(int i=0;i<n;i++) {
		  Boolean flag=false;
		  for(int j=0;j<n-i-1;j++) {
			 if(arr[j+1]<arr[j]) {
				 flag=true;
				int temp= arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
			 }
		  }
		  if(flag==false) {
				 break;
			 }
	  }
	  }
	  
  public static void main(String args[]) {
	 int arr[]= {1,4,2,8,3};
	 bubbleSort(arr, 5);
	 for(int i=0;i<5;i++) {
		 System.out.print(arr[i]+" ");
	 }
  
}
}

