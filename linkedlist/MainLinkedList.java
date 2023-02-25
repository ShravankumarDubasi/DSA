package linkedlist;
import java.util.*;
public class MainLinkedList {
    public static void main(String[] args){
        MainClass<Integer> myLL=new MainClass<>();
        myLL.add(10);
        myLL.add(28);
        myLL.addAtHead(2);
        myLL.insertBtw(0,29);
        myLL.del(1);
//        myLL.reverse();
        myLL.print();
        int    result=myLL.size();
        System.out.println(result);
    }
}
