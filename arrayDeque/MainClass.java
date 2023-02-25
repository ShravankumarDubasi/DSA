package arrayDeque;

import java.util.*;

public class MainClass {
    public static void main(String[] args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
//        stack functions
//        ad.push(21);
//        ad.push(22);
//        System.out.println(ad.pop());
//        System.out.println(ad.peek());

//          queue functions
//        ad.offer(22);
//        ad.offer(23);
//        System.out.println(ad.poll());
//        System.out.println(ad.peek());
//        ad.add(43);
//        ad.add(39);
//        System.out.println(ad.remove());
//        System.out.println(ad.element());


//        arraydeck functions

//         ad.offerFirst(22);
//         ad.pollFirst();
//         System.out.println(ad.peekFirst());
//         ad.addFirst(34);
//         ad.removeFirst();
//        System.out.println( ad.getFirst());
        Deque<Integer> Ad=new Deque<>();
        Ad.addToHead(54);
        Ad.addToHead(65);
        System.out.println(Ad.removeLast());

    }
}
