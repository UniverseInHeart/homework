package redis.lettuce;

import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;

/**
 * 基于Lettuce sentinel
 */
public class LettuceSentinelTest {

    public static void main(String[] args) {
        RedisClient redisClient = RedisClient.create("redis-sentinel://localhost:26379,localhost:26380/0#mymaster");

        StatefulRedisConnection<String, String> connection = redisClient.connect();
		RedisCommands<String, String> syncCommands = connection.sync();

		syncCommands.set("key", "Hello, Redis!");
		System.out.println(syncCommands.get("key"));
        System.out.println("Connected to Redis using Redis Sentinel");

        connection.close();
        redisClient.shutdown();
    }
}
