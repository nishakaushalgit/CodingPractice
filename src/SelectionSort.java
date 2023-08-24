public class SelectionSort {
    static void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={3, 1,8, 5};
        selectionSort(arr);
        for(int i=0; i<4;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
