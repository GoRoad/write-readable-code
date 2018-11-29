package me.groad.chapter_01;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: writereadablecode
 * @BelongsPackage: me.groad.chapter_01
 * @Author: Groad
 * @CreateTime: 2018-11-30 00:53
 * @Description:
 * @Version: 1.0
 */
public class Example3
{
    private Map<String, Coder> coderMap = new HashMap<>();

    public Example3()
    {
        coderMap.put("王振", new Coder(true));
        coderMap.put("80K", new Coder(false));
    }

    private Coder findCoder(String key)
    {
        return coderMap.get(key);
    }

    public void before()
    {
        Coder coder;
        boolean hasGirlFriend = (null != (coder = findCoder("王振"))) && coder.hasGirlFriend();
        System.out.println("是否拥有女朋友:" + hasGirlFriend);
    }

    public void after()
    {
        Coder coder = this.findCoder("王振");
        if (null != coder)
        {
            System.out.println("是否拥有女朋友:" + coder.hasGirlFriend());
        }
    }

    public static void main(String[] args)
    {
        new Example3().before();
        new Example3().after();
    }
}
