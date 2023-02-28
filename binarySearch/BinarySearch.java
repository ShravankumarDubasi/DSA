public class  BinarySearch {
    public static void main(String args[]){
        int[] arr={3,4,2,1,6,9,8};
        int n=arr.length;
       int res= binarySearch(arr,0);
        System.out.println(res);


    }
    static int binarySearch(int[] arr,int key){
  int l=0;
  int h=arr.length;

      while(l<=h){
          int mid=(l+h)/2;
          if(arr[mid]==key){
              return arr[mid];
          }
          else if(key>arr[mid]){
              l=mid+1;
          }
          else{
              h=mid-1;
          }



      }
      return -1;

    }
}
