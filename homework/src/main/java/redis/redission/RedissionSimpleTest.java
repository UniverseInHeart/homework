package redis.redission;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissionSimpleTest {

    public static void main(String[] args) {

        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://localhost:6379");
        RedissonClient client = Redisson.create(config);
        RMap<String, String> map = client.getMap("map");
        map.put("test", "test");
        System.out.println(map.toString());
    }
}
