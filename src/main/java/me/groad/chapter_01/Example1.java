package me.groad.chapter_01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @BelongsProject: writereadablecode
 * @BelongsPackage: me.groad.chapter_01
 * @Author: Groad
 * @CreateTime: 2018-11-29 23:30
 * @Description: 例子1
 * @Version: 1.0
 */
public class Example1
{

    /*
    * LinkedList类是双向列表，列表中的每个节点都包含了对前一个和后一个元素的引用
    * Queue先进先出的队列
    * LinkedList实现了Deque接口，Deque接口继承了Queue接口，所以LinkedList也可以当做Queue来操作
    * Queue之peek() 检索但不删除并返回最顶层的元素，如果该队列为空，则返回null
    * */
    Queue<Node> nodes = new LinkedList<Node>();

    //初始化类,并加入数据
    public Example1()
    {
        nodes.add(new Node());
        nodes.add(new Node());
    }

    public void snippetOne()
    {
        for (Node node = nodes.peek();node != null;node = node.next())
        {
            System.out.println(node.data());
        }
    }

    public void snippetTwo()
    {
        Node node = nodes.peek();
        if (node == null) return;
        while (node.next() != null)
        {
            System.out.println(node.data());
            node = node.next();
        }
        if (node != null)
        {
            System.out.println(node.data());
        }
    }
}
