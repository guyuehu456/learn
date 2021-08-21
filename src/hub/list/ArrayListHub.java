package hub.list;

import java.util.ArrayList;

/**
 * @author hub
 *
 * @date 2021/8/21
 * @description ArrayList集合的test
 */
public class ArrayListHub {
    public static void main(String[] args) {
        ArrayList<String> listFir = new ArrayList<>();
        //添加元素
        listFir.add("qwe");
        listFir.add("asd");
        listFir.add("zxc");
        listFir.forEach(fir ->{
            System.out.println("fir集合的元素 = " + fir);
        });
        System.out.println("集合listFir存储元素的个数" + listFir.size());
        //删除元素 时间复杂度为O(n)
        listFir.remove("qwe");
        listFir.forEach(fir ->{
            System.out.println("fir删除元素后 = " + fir);
        });
        System.out.println("集合listFir存储元素的个数" + listFir.size());


        ArrayList<String> listSec = new ArrayList<>();
        //添加元素
        listSec.add("qwe");
        listSec.add("asd");
        listSec.add("zxc");
        listSec.add("rty");
        listSec.forEach(sec ->{
            System.out.println("sec集合的元素=" + sec);
        });
        //求集合的交集
//        listSec.retainAll(listFir);
//        listSec.forEach(firDiffSec ->{
//            System.out.println("sec集合和fir集合的共有元素=" + firDiffSec);
//        });
        
        //求集合的单方向差集
        listSec.removeAll(listFir);
        listSec.forEach(secSubFir ->{
            System.out.println("sec集合不含有fir集合元素的剩余元素 = " + secSubFir);
        });
        /**
         * （1）ArrayList内部使用数组存储元素，当数组长度不够时进行扩容，每次加一半的空间，ArrayList不会进行缩容；
         *
         * （2）ArrayList支持随机访问，通过索引访问元素极快，时间复杂度为O(1)；
         *
         * （3）ArrayList添加元素到尾部极快，平均时间复杂度为O(1)；
         *
         * （4）ArrayList添加元素到中间比较慢，因为要搬移元素，平均时间复杂度为O(n)；
         *
         * （5）ArrayList从尾部删除元素极快，时间复杂度为O(1)；
         *
         * （6）ArrayList从中间删除元素比较慢，因为要搬移元素，平均时间复杂度为O(n)；
         *
         * （7）ArrayList支持求并集，调用addAll(Collection<? extends E> c)方法即可；
         *
         * （8）ArrayList支持求交集，调用retainAll(Collection<? extends E> c)方法即可；
         *
         * （7）ArrayList支持求单向差集，调用removeAll(Collection<? extends E> c)方法即可；
         */



    }
}
