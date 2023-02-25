package stacks;

import linkedlist.MainClass;

public class MyStack<E> {
    MainClass<E> ll=new MainClass<>();

    void push(E e){
        ll.add(e);
    }

    E pop() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("cannot pop from empty stack");
        }
        return ll.removeLast();
    }



    E peek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("cannot peek from empty stack");
        }
        return ll.getlast();
    }
}
