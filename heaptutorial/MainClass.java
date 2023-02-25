package heap;

public class MainClass {
    public static  void main(String[] args){
        int a[]={0,10,30,50,20,35,15};
        int n=a.length;
        buildHeap(a,n);


//        heapSort(a,n);
        
        for(int i=1;i<n;i++) {
            System.out.println(a[i]);
        }
    }
    static void heapSort(int a[],int n){
        //heap sort implementation
        buildHeap(a,n);
        for(int i=n-1;i>1;i--){
            int temp=a[i];
            a[i]=a[1];
            a[1]=temp;
            heapify(a,i-1,1);
        }
    }
    static void buildHeap(int a[],int n){
        for(int i=n/2;i>0;i--){
            heapify(a,n,i);
        }
    }
    static void heapify(int a[],int n,int i){
        // Heapify implementation
        int l=2*i;
        int r=2*i+1;
        int largest=i;
        if(l<n && a[largest]<a[l]){
            largest=l;
        }
        if(r<n && a[largest]<a[r]){
            largest=r;
        }
        if(largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify( a,n,largest);
        }
    }
}
