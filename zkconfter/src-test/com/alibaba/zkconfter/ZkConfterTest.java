package com.alibaba.zkconfter;

import org.junit.Test;

/**
 * Created by pinian.lpn on 2015/8/7.
 */
public class ZkConfterTest {

    @Test
    public void testZkConfter() throws Exception {
        ZkConfter zkConfter = new ZkConfter("zkconfter.properties");
        zkConfter.afterPropertiesSet();

//        ZkClient zkClient = zkConfter.getZkClient();
//        String zkDrmAttribute = "/zkconfter/zkconfter-client-test/drm/dev/com.alibaba.zkconfter.drm.DRMResourceTest/testInt";
//
//        JSONObject dataAttribute = JSON.parseObject(zkClient.readData(zkDrmAttribute).toString());
//        dataAttribute.put("value", 1);
//        zkClient.writeData(zkDrmAttribute, dataAttribute.toString(), CreateMode.PERSISTENT);
//
//
//        TimeUnit.MINUTES.sleep(2);
    }
}