/**
 * FileName: RedisTest
 * Author:   Lenovo
 * Date:     1/7/2019 6:49 PM
 * Description:
 * History:
 */
package redis;

//public class RedisTest {
//}
//


import redis.clients.jedis.Jedis;

//连接到 redis 服务
public class RedisConnection {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.31.49");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
    }
}