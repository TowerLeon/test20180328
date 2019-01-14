/**
 * FileName: RedisStringJava
 * Author:   Lenovo
 * Date:     1/7/2019 9:22 PM
 * Description:
 * History:
 */
package redis;

import redis.clients.jedis.Jedis;

//Redis Java String(字符串) 实例
public class RedisStringJava {
    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.31.49");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
    }
}