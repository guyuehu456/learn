package hub.list;

import java.util.LinkedList;

/**
 * @author hub
 *
 * @date 2021/8/21
 * @description LinkedList集合的test
 */
public class LinkedListHub {
    /**
     * LinkedList是一个以双向链表实现的List，
     * 它除了作为List使用，还可以作为队列或者栈来使用
     */
    public static void main(String[] args) {
        LinkedList<String> firList = new LinkedList<>();
        firList.add("qwe");
        firList.add("asd");
        firList.add("zxc");
        firList.forEach(fir ->{
            System.out.println("fir = " + fir);
        });

        firList.addFirst("首位");
        firList.addLast("末尾");
        firList.forEach(fir->{
            System.out.println("fir首尾添加元素 = " + fir);
        });

        firList.add(1,"指定位置添加元素");
        firList.forEach(fir ->{
            System.out.println("fir指定位置添加元素 = " + fir);
        });

        firList.removeFirst();
        firList.removeLast();
        String pop1 = firList.pop();
        System.out.println("firList删除的栈顶元素 = " + pop1);
        String pop2 = firList.pop();
        System.out.println("firList删除的栈顶元素 = " + pop2);

        firList.forEach(fir ->{
            System.out.println("fir = " + fir);
        });

        /**
         * 总结：
         * （1）LinkedList是一个以双链表实现的List；
         *
         * （2）LinkedList还是一个双端队列，具有队列、双端队列、栈的特性；
         *
         * （3）LinkedList在队列首尾添加、删除元素非常高效，时间复杂度为O(1)；
         *
         * （4）LinkedList在中间添加、删除元素比较低效，时间复杂度为O(n)；
         *
         * （5）LinkedList不支持随机访问，所以访问非队列首尾的元素比较低效；
         *
         * （6）LinkedList在功能上等于ArrayList + ArrayDeque；
         */


    }
}
