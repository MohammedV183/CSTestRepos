import java.util.PriorityQueue;

public class PqTest {
    public static void main(String[] args) {

        PriorityQueue<Integer> integerQueue = new PriorityQueue<Integer>();
        int one = 20;
        int two = 8;
        int three = 15;

        integerQueue.add(one);
        integerQueue.add(two);
        integerQueue.add(three);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());

        //8 15 20


    }
}
