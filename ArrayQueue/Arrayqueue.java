package queue.src;

public class Arrayqueue {
    public static void main(String args[]){

        Arrayqueue a=new Arrayqueue(5);
        a.enqueue(22);
        a.enqueue(25);
        System.out.println(a.deque());
    }
    int capacity;
    int rear;
    int[] arr;
    public Arrayqueue(int n){
        capacity=n;
        arr=new int[n];
        rear=-1;
    }
    public void enqueue(int data){

        if(rear==capacity-1){
            System.out.println("queue is filled");
        }
        else{
            rear++;
            arr[rear]= data;
        }

    }
    public int  deque(){
        if(rear==-1){
            System.out.println("queue is empty");
        }
        int result=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
       return result;
    }

}
