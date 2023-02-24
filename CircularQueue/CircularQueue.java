package queue.src;

public class CircularQueue {
    public static void main(String args[]){
CircularQueue c=new CircularQueue(5);
//        System.out.println(c.deque());
c.enque(357);
c.enque(987);
        System.out.println(c.deque());
    }
    int[] arr;
    int n;
    int rear=-1,front=-1;

    public CircularQueue(int n){
        this.n=n;
        arr=new int[n];

    }
    void enque(int data){
        if((rear+1)%n==front){
            System.out.println("queue is full");
        }
        if(front==-1) front=0;
        rear=(rear+1)%n;
        arr[rear]=data;
    }
    int deque(){
        if(front ==-1){
            System.out.println("queue is empty");
        }
        int result=arr[front];
        if(front==rear){
            rear=front=-1;

        }
        else{
            front=(front+1)%n;
        }
        return result;
    }
}
