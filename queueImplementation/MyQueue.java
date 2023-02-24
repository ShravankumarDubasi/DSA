package queue;

import linkedlist.MainClass.node;

public class MyQueue<E> {
    private node<E> head,rear;
    public void enqueue(E data){
        node<E> toAdd=new node<>(data);
        if (head==null){
            head=rear=toAdd;
            return;
        }
        rear.next=toAdd;
        rear=rear.next;
    }
    public E dequeue(){
        if (head==null){
            return null;
        }


        node<E> temp=head;

        head=head.next;
        if(head==null){
            rear=null;
        }
        return temp.data;


    }
    public E peek(){
        if(head==null){
            return  null;
        }
        return  head.data;
    }


}
