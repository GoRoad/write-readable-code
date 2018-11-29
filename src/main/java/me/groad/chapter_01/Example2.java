package me.groad.chapter_01;

/**
 * @BelongsProject: writereadablecode
 * @BelongsPackage: me.groad.chapter_01
 * @Author: Groad
 * @CreateTime: 2018-11-30 00:39
 * @Description:
 * @Version: 1.0
 */
public class Example2
{
    private int    cap    = 2333;
    private double weight = 1.5;

    private double before()
    {
        return cap >= 0 ? weight * (1 << cap) : weight / (1 << -cap);
    }

    private double after()
    {
        if (cap >= 0)
        {
            return weight * (1 << cap);
        }
        return weight / (1 << -cap);
    }
}
