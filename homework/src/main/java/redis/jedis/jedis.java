package redis.jedis;

public class jedis {

    public static void main(String[] args) {
        // C1.最简单demo
//		Jedis jedis = new Jedis("localhost", 6379);
//		System.out.println(jedis.info());
//		jedis.set("uptime", new Long(System.currentTimeMillis()).toString());
//		System.out.println(jedis.get("uptime"));

//		// C2.基于sentinel和连接池的demo
//		Jedis sjedis = SentinelJedis.getJedis();
//		System.out.println(sjedis.info());
//		sjedis.set("uptime2", new Long(System.currentTimeMillis()).toString());
//		System.out.println(sjedis.get("uptime2"));
//		SentinelJedis.close();

        // C3. 直接连接sentinel进行操作
//		Jedis jedisSentinel = new Jedis("localhost", 26380); // 连接到sentinel
//		List<Map<String, String>> masters = jedisSentinel.sentinelMasters();
//		System.out.println(JSON.toJSONString(masters));
//		List<Map<String, String>> slaves = jedisSentinel.sentinelSlaves("mymaster");
//		System.out.println(JSON.toJSONString(slaves));
    }
}
