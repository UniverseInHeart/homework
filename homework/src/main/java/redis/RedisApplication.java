package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication(scanBasePackages = "redis")
public class RedisApplication {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public static void main(String[] args) {

	}

	private void springRedisSentinel() {
		redisTemplate.opsForValue().set("test", "test");
		System.out.println(redisTemplate.opsForValue().get("test"));
	}

}
