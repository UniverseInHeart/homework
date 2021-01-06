package redis.lettuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

/**
 * 基于Lettuce 简单的demo start
 */
public class LettuceSimpleTest {

    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis://@localhost:6379");
        StatefulRedisConnection<String, String> connection = redisClient.connect();
        RedisCommands<String, String> syncCommands = connection.sync();

        syncCommands.set("key", "Hello, Redis!");
        System.out.println(syncCommands.get("key"));

        connection.close();
        redisClient.shutdown();
    }
}
