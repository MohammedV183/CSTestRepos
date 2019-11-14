import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class StackTest {

    public static void main(String [] args){

        ArrayDeque<String> stack = new ArrayDeque<String>();
        String one = "One";
        String two = "Two";
        String three = "Three";

        stack.push(one);
        stack.push(two);
        stack.push(three);

        System.out.println(stack.peekLast());
        System.out.println(stack.peekFirst());
        stack.removeLast();
        System.out.println(stack.size());

        ArrayDeque<String> queue = new ArrayDeque<String>();
        queue.push(one);
        queue.push(two);
        queue.push(three);

        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        queue.poll();



    }
}
