package me.groad.chapter_01;

/**
 * @BelongsProject: writereadablecode
 * @BelongsPackage: me.groad.chapter_01
 * @Author: Groad
 * @CreateTime: 2018-11-30 01:08
 * @Description: 计算Hash
 * @Version: 1.0
 */
public class Example4
{
    private int hash;
    private int c = 2018;

    public void calcHash()
    {
        /*
        * Fast version of "hash = (65599 + hash) + c"
        * 计算是不可能计算的，这辈子都不可能
        * */
        hash = (hash << 6) + (hash << 16) - hash + c;
    }
}
