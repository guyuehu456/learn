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
         * ArrayList实现了List, RandomAccess, Cloneable, java.io.Serializable等接口。
         *
         * ArrayList实现了List，提供了基础的添加、删除、遍历等操作。
         *
         * ArrayList实现了RandomAccess，提供了随机访问的能力。
         *
         * ArrayList实现了Cloneable，可以被克隆。
         *
         * ArrayList实现了Serializable，可以被序列化。
         */

        /**
         * （1）DEFAULT_CAPACITY
         *
         * 默认容量为10，也就是通过new ArrayList()创建时的默认容量。
         *
         * （2）EMPTY_ELEMENTDATA
         *
         * 空的数组，这种是通过new ArrayList(0)创建时用的是这个空数组。
         *
         * （3）DEFAULTCAPACITY_EMPTY_ELEMENTDATA
         *
         * 也是空数组，这种是通过new ArrayList()创建时用的是这个空数组，与EMPTY_ELEMENTDATA的区别是在添加第一个元素时使用这个空数组的会初始化为DEFAULT_CAPACITY（10）个元素。
         *
         * （4）elementData
         *
         * 真正存放元素的地方，使用transient是为了不序列化这个字段。
         *
         * 至于没有使用private修饰，后面注释是写的“为了简化嵌套类的访问”，但是楼主实测加了private嵌套类一样可以访问。
         *
         * private表示是类私有的属性，只要是在这个类内部都可以访问，嵌套类或者内部类也是在类的内部，所以也可以访问类的私有成员。
         *
         * （5）size
         *
         * 真正存储元素的个数，而不是elementData数组的长度。
         */


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


        /**
         * elementData设置成了transient，那ArrayList是怎么把元素序列化的呢？
         *
         * 查看writeObject()方法可知，先调用s.defaultWriteObject()方法，再把size写入到流中，再把元素一个一个的写入到流中。
         *
         * 一般地，只要实现了Serializable接口即可自动序列化，writeObject()和readObject()是为了自己控制序列化的方式，
         * 这两个方法必须声明为private，在java.io.ObjectStreamClass#getPrivateMethod()方法中通过反射获取到writeObject()这个方法。
         *
         * 在ArrayList的writeObject()方法中先调用了s.defaultWriteObject()方法，这个方法是写入非static非transient的属性，
         * 在ArrayList中也就是size属性。同样地，在readObject()方法中先调用了s.defaultReadObject()方法解析出了size属性。
         *
         * elementData定义为transient的优势，自己根据size序列化真实的元素，而不是根据数组的长度序列化元素，减少了空间占用。
         */

    }
}
