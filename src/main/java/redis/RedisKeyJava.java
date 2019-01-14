/**
 * FileName: RedisKeyJava
 * Author:   Lenovo
 * Date:     1/7/2019 9:25 PM
 * Description:
 * History:
 */
package redis;

import java.util.Iterator;
import java.util.Set;
import redis.clients.jedis.Jedis;

//Redis Java Keys 实例
public class RedisKeyJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.31.49");
        System.out.println("连接成功");

        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
}