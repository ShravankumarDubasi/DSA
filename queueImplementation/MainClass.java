package queue;

public class MainClass {
    public static void main(String[] args){
        MyQueue<Integer> mq=new MyQueue<>();
        mq.enqueue(29);
        mq.enqueue(30);
        mq.enqueue(39);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        mq.enqueue(39);
        System.out.println(mq.peek());

    }
}
