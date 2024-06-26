package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        //add(e) & offer(e)
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(3);
        Utility.printCollection(queue);

        //remove(e) & poll()
        System.out.println(queue.remove(3));        //true
        Utility.printCollection(queue);
        System.out.println(queue.poll());   //removes head and returns its value
        Utility.printCollection(queue);

        System.out.println(queue.remove(10));       //false
        Utility.printCollection(queue);

        System.out.println(queue.element());    //retrieves head()
        Utility.printCollection(queue);
        System.out.println(queue.peek());       //retrieves head()

        queue.remove();
        queue.remove();
        Utility.printCollection(queue);

        //On empty queue
        //System.out.println(queue.remove());     //throws NoSuchElementException
        System.out.println(queue.poll());           //returns null
        System.out.println(queue.peek());           //returns null
        //System.out.println(queue.element());        //throws NoSuchElementException




    }
}
