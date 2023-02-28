public class QuickSort {
    public static void main(String args[]){

  int[] arr={5,7,3,2,1,9,4};
   int n=arr.length;
   quicksort(arr,0,n-1);
   for(int i=0;i<n;i++){
       System.out.print(arr[i]);
   }




    }
   static void quicksort(int arr[],int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,h);
        }

    }

   static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;

    while(i<j) {
        while (arr[i] <= pivot&& i<=h-1) i++;
        while (arr[j] > pivot&&j>=l) j--;
        if(i<j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

        int temp1 = arr[j];
        arr[j] = arr[l];
        arr[l]= temp1;



      return j;
    }
}
