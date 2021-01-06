package redis.redission;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissionSentinelTest {
    public static void main(String[] args) {

        Config config = new Config();
        config.useSentinelServers().addSentinelAddress("redis://localhost:26379");
        RedissonClient client = Redisson.create(config);
        RMap<String, String> map = client.getMap("map");
        map.put("test", "test");
        System.out.println(map.toString());
    }
}
