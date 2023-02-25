package stacks;
import java.util.Stack;
public class MainClass {
    public static  void main(String[] args) throws Exception {
        MyStack<Integer> stack=new MyStack();
//        stack.push(22);
        stack.push(28);
        stack.push(65);
       int popped= stack.pop();
       System.out.println(popped);
       int peeked=stack.peek();
       System.out.println(peeked);

    }
}
