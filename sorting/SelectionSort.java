package sorting;

public class SelectionSort {
    public static void main(String[] args){
        int a[]={1,3,2,6,4};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int minind=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[minind])
                {
                    minind=j;
                }
            }
            System.out.println(a[minind]);
            int temp=a[i];
            a[i]=a[minind];
            a[minind]=temp;
        }
        for(int items:a){
            //System.out.print(items);
        }
    }
}
