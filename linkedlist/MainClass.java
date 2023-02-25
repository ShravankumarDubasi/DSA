package linkedlist;

public class MainClass<E> {

    node<E> head;
    public void add(E data) {
        node<E> toadd = new node<E>(data);
       if (isEmpty()){
           head=toadd;
           return;
       }

        node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toadd;
    }
       public boolean isEmpty(){
            return head==null;
        }
        void addAtHead(E data){
        node<E> toAdd=new node<E>(data);
        if(isEmpty()){
            head=toAdd;
            return;
        }
        toAdd.next=head;
        head=toAdd;

        }
        void insertBtw(int index,E data) {
            node<E> toAddbtw = new node<E>(data);
            node<E> temp = head;
            if (index == 0) {
                addAtHead(data);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                node<E> temp1 = temp.next;
                temp.next = toAddbtw;
                toAddbtw.next = temp1;
            }
        }


        int size(){
        int count=0;
        node<E> temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count+1;
        }

        void del(int index){

        node<E> temp=head;
        node<E> temp1=null;
        if(index==0){
            head=head.next;
        }
        for(int i=0;i<index-1;i++){
        temp=temp.next;
        }
        temp1=temp.next;
        temp.next=temp1.next;
        }
        public E  removeLast() throws Exception{

        node<E> temp=head;
        if(temp==null){
            throw new Exception("cannot remove element from empty ll" + "");
        }
        if(temp.next==null){
            node<E> toRemove=head;
            head=null;
            return toRemove.data;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        node<E> toRemove=temp.next;
        temp.next=null;
        return toRemove.data;

        }
        public E getlast() throws Exception{
            node<E> temp=head;
            if(temp==null){
                throw new Exception("cannot peek element from empty ll");
            }

            while(temp.next!=null){
                temp=temp.next;
            }

            return temp.data;

        }
    void print(){
        node<E> temp = head;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static class node<E>{
        public E data;
       public node<E> next;
        public node(E data){


            this.data=data;
            next =null;
        }
    }

}
