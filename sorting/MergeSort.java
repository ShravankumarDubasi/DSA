public class MergeSort {
    public static void main(String args[]){

        int[] arr={7,5,8,4,3,1,9,33,21,19};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    static void merge(int[] arr,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int[] b=new int[arr.length];
        int k=l;


        while(i<=mid&&j<=r){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }
            else{
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr[i];
                i++;
                k++;
            }

        }
        for(int m=l;m<=r;m++){
            arr[m]=b[m];
        }
    }

}
