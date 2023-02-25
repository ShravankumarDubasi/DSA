package arrayDeque;

public class Deque<E> {
    node<E> head,tail;
    public void addToHead(E data){
        node<E> toAdd=new node<E>(data);
        if(head==null){
            head=tail=toAdd;
        }
        head.next=toAdd;
        toAdd.prev=head;
        head=toAdd;
    }
    public E removeLast(){
        if(head==null){
            return null;
        }
        node<E> toRemove=tail;
        tail=tail.next;
        tail.prev=null;
        if(tail==null){
            head=null;

        }
        toRemove.next=null;
        return toRemove.data;
    }
    public static class node<E>{
        E data;
        node<E> next,prev;
        public node(E data){
            this.data=data;
            this.prev=this.next=null;
        }

    }
}
